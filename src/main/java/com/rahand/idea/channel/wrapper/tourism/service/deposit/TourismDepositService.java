package com.rahand.idea.channel.wrapper.tourism.service.deposit;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rahand.idea.channel.config.TourismConfig;
import com.rahand.idea.channel.dto.deposit.*;
import com.rahand.idea.channel.exception.ApiErrorResponse;
import com.rahand.idea.channel.exception.CustomWebClientException;
import com.rahand.idea.channel.util.LogUtils;
import com.rahand.idea.channel.util.date.DateUtils;
import com.rahand.idea.channel.wrapper.tourism.dto.TourismDepositBalanceData;
import com.rahand.idea.channel.wrapper.tourism.dto.TourismDepositBalanceResponse;
import com.rahand.idea.channel.wrapper.tourism.dto.TourismDepositStatementsData;
import com.rahand.idea.channel.wrapper.tourism.dto.TourismStatementsResponse;
import com.rahand.idea.channel.wrapper.tourism.encryption.TourismEncryption;
import com.rahand.idea.channel.wrapper.tourism.proxy.UserServicesLocator;
import com.rahand.idea.channel.wrapper.tourism.proxy.UserServicesSoap;
import com.rahand.idea.channel.wrapper.tourism.util.TourismUtil;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.xml.rpc.ServiceException;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

@Service
public class TourismDepositService {

    private Logger logger = LogUtils.getLogger();

    @Autowired
    private TourismConfig tourismConfig;

    @Autowired
    private TourismEncryption encryption;


    public TourismDepositService() {
    }

    public DepositBalanceResponse getDepositBalance(DepositBalanceRequest request) {

        logger.info("Tourism => depositBalance() Service call started ... channelStatementsRequest: " + request.toString());

        DepositBalanceResponse balanceResponse = null;

        try {
            ObjectMapper mapper = new ObjectMapper();
            LinkedHashMap<String, Object> requestMap = new LinkedHashMap<>();
            requestMap.put("Username", tourismConfig.getUserName());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:FFF");
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            requestMap.put("Timestamp", simpleDateFormat.format(timestamp));
            requestMap.put("DepositNumber", request.getDeposit_number());
            String requestJson = mapper.writeValueAsString(requestMap);
            String signature = encryption.signRequest(requestJson);
            UserServicesLocator servicesLocator = new UserServicesLocator();
            UserServicesSoap userServices = servicesLocator.getUserServicesSoap12(new URL(tourismConfig.getServiceUrl()));
            String responseJson = userServices.getDepositBalance(requestJson, signature);
            logger.info(String.format("Bank Response : %s  ", responseJson));
            TourismDepositBalanceResponse tourismDepositBalanceResponse = mapper.readValue(responseJson, TourismDepositBalanceResponse.class);

            if (tourismDepositBalanceResponse.isIsSuccess()) {

                TourismDepositBalanceData tourismDepositBalanceData = tourismDepositBalanceResponse.getData();
                tourismDepositBalanceData.initDepositBalanceData();

                balanceResponse = new DepositBalanceResponse();
                balanceResponse.setBalance(tourismDepositBalanceData.getAmount());
                balanceResponse.setAvailable_balance(tourismDepositBalanceData.getAvailableAmount());
                balanceResponse.setBlocked_amount(tourismDepositBalanceData.getBlockedAmount());
                balanceResponse.setDeposit_number(tourismDepositBalanceData.getDepositNumber());
                balanceResponse.setCurrency(tourismDepositBalanceData.getCurrency());
                balanceResponse.setOperation_time(DateUtils.getSysDateInStr("yyyy-MM-dd'T'HH:mm:ss"));
                balanceResponse.setBranchCode("");
                balanceResponse.setExtra_available_balance(0l);

            } else {

                if (TourismUtil.isServerError(tourismDepositBalanceResponse.getErrorCode())) {

                    logger.error("Error in Tourism DepositBalance Service : " + tourismDepositBalanceResponse.getMessage());
                    throw new CustomWebClientException(HttpStatus.INTERNAL_SERVER_ERROR,
                            new ApiErrorResponse(LocalDateTime.now(), HttpStatus.INTERNAL_SERVER_ERROR, tourismDepositBalanceResponse.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value()));
                } else {
                    logger.error("Error in Tourism DepositBalance Service : " + tourismDepositBalanceResponse.getMessage());
                    throw new CustomWebClientException(HttpStatus.BAD_REQUEST,
                            new ApiErrorResponse(LocalDateTime.now(), HttpStatus.BAD_REQUEST, tourismDepositBalanceResponse.getMessage(), HttpStatus.BAD_REQUEST.value()));
                }

            }
        } catch (MalformedURLException e) {
            logger.error("Error in Tourism DepositBalance Service : " + e.getMessage());
            throw new CustomWebClientException(HttpStatus.INTERNAL_SERVER_ERROR,
                    new ApiErrorResponse(LocalDateTime.now(), HttpStatus.INTERNAL_SERVER_ERROR, "INTERNAL SERVER ERROR : " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value()));
        } catch (ServiceException e) {
            logger.error("Error in Tourism DepositBalance Service : " + e.getMessage());
            throw new CustomWebClientException(HttpStatus.INTERNAL_SERVER_ERROR,
                    new ApiErrorResponse(LocalDateTime.now(), HttpStatus.INTERNAL_SERVER_ERROR, "INTERNAL SERVER ERROR : " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value()));
        } catch (RemoteException e) {
            logger.error("Error in Tourism DepositBalance Service : " + e.getMessage());
            throw new CustomWebClientException(HttpStatus.INTERNAL_SERVER_ERROR,
                    new ApiErrorResponse(LocalDateTime.now(), HttpStatus.INTERNAL_SERVER_ERROR, "INTERNAL SERVER ERROR : " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value()));
        } catch (JsonProcessingException e) {
            logger.error("Error in Tourism DepositBalance Service : " + e.getMessage());
            throw new CustomWebClientException(HttpStatus.INTERNAL_SERVER_ERROR,
                    new ApiErrorResponse(LocalDateTime.now(), HttpStatus.INTERNAL_SERVER_ERROR, "INTERNAL SERVER ERROR : " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value()));
        }

        logger.info(String.format("Channel Response : %s  ", balanceResponse.toString()));

        return balanceResponse;
    }

    public DepositStatementsResponse getDepositStatements(DepositStatementsRequest request) {

        logger.info("Tourism => depositStatement() Service call started, channelStatementsRequest: {}", request.toString());

        DepositStatementsResponse statementsResponse = null;
        List<Statement> statements = null;

        try {
            ObjectMapper mapper = new ObjectMapper();
            LinkedHashMap<String, Object> requestMap = new LinkedHashMap<>();
            requestMap.put("Username", tourismConfig.getUserName());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:FFF");
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            requestMap.put("Timestamp", simpleDateFormat.format(timestamp));
            requestMap.put("DepositNumber", request.getDeposit_number());
            Timestamp startTimestamp = new Timestamp(DateUtils.getDateFromStr(request.getFrom_date(), "yyyy-MM-dd'T'HH:mm:ss").getTime());
            requestMap.put("StartDate", simpleDateFormat.format(startTimestamp));
            Timestamp endDateTimestamp = new Timestamp(DateUtils.getDateFromStr(request.getTo_date(), "yyyy-MM-dd'T'HH:mm:ss").getTime());
            requestMap.put("EndDate", simpleDateFormat.format(endDateTimestamp));
            String requestJson = mapper.writeValueAsString(requestMap);
            String signature = encryption.signRequest(requestJson);
            UserServicesLocator servicesLocator = new UserServicesLocator();
            UserServicesSoap userServices = servicesLocator.getUserServicesSoap(new URL(tourismConfig.getServiceUrl()));
            String responseJson = userServices.getDepositInvoice(requestJson, signature);
            logger.info(String.format("Bank Response : %s  ", responseJson));
            TourismStatementsResponse tourismStatementsResponse = mapper.readValue(responseJson, TourismStatementsResponse.class);

            if (tourismStatementsResponse.isIsSuccess()) {

                statements = new ArrayList<>();
                List<TourismDepositStatementsData> tourismDepositStatementsData = tourismStatementsResponse.getData();

                for (int i = 0; i < tourismDepositStatementsData.size(); i++) {

                    TourismDepositStatementsData depositStatementsData = mapper.readValue(mapper.writeValueAsString(tourismDepositStatementsData.get(i)), TourismDepositStatementsData.class);
                    Statement statement = new Statement();

                    statement.setAgent_branch_code("");
                    statement.setAgent_branch_name("");
                    statement.setBalance(depositStatementsData.getAmount());
                    statement.setBranch_code(depositStatementsData.getBranchCode());
                    statement.setBranch_name(depositStatementsData.getBranchName());
                    statement.setTransaction_date(TourismUtil.persianDateToGregorianDate(depositStatementsData.getTransactionDate()));
                    statement.setDescription(depositStatementsData.getDescription());
                    statement.setReference_number(depositStatementsData.getTransactionCode());
                    statement.setSerial(0);
                    statement.setSerial_number(depositStatementsData.getDocNumber());

                    Long transferAmount = depositStatementsData.getCreditorAmount() > 0 ? depositStatementsData.getCreditorAmount() : depositStatementsData.getDeptorAmount() * -1;

                    statement.setTransfer_amount(transferAmount);

                    Long fromDateEpochTime = DateUtils.getDateFromStr(request.getFrom_date(),"yyyy-MM-dd'T'HH:mm:ss").getTime();
                    Long toDateEpochTime = DateUtils.getDateFromStr(request.getTo_date(),"yyyy-MM-dd'T'HH:mm:ss").getTime();
                    Long transactionEpochTime = DateUtils.getDateFromStr(statement.getTransaction_date(),"yyyy-MM-dd'T'HH:mm:ss").getTime();

                    if (transactionEpochTime > toDateEpochTime || transactionEpochTime < fromDateEpochTime) {
                        continue;
                    }
                    statements.add(statement);
                }

            } else {
                if (TourismUtil.isServerError(tourismStatementsResponse.getErrorCode())) {
                    logger.error("Error in Tourism DepositStatements Service : " + tourismStatementsResponse.getMessage());
                    throw new CustomWebClientException(HttpStatus.INTERNAL_SERVER_ERROR,
                            new ApiErrorResponse(LocalDateTime.now(), HttpStatus.INTERNAL_SERVER_ERROR, tourismStatementsResponse.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value()));
                } else {
                    logger.error("Error in Tourism DepositStatements Service : " + tourismStatementsResponse.getMessage());
                    throw new CustomWebClientException(HttpStatus.BAD_REQUEST,
                            new ApiErrorResponse(LocalDateTime.now(), HttpStatus.BAD_REQUEST, tourismStatementsResponse.getMessage(), HttpStatus.BAD_REQUEST.value()));
                }
            }
        } catch (MalformedURLException e) {
            logger.error("Error in Tourism DepositStatements Service : " + e.getMessage());
            throw new CustomWebClientException(HttpStatus.INTERNAL_SERVER_ERROR,
                    new ApiErrorResponse(LocalDateTime.now(), HttpStatus.INTERNAL_SERVER_ERROR, "INTERNAL SERVER ERROR : " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value()));
        } catch (ServiceException e) {
            logger.error("Error in Tourism DepositStatements Service : " + e.getMessage());
            throw new CustomWebClientException(HttpStatus.INTERNAL_SERVER_ERROR,
                    new ApiErrorResponse(LocalDateTime.now(), HttpStatus.INTERNAL_SERVER_ERROR, "INTERNAL SERVER ERROR : " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value()));
        } catch (RemoteException e) {
            logger.error("Error in Tourism DepositStatements Service : " + e.getMessage());
            throw new CustomWebClientException(HttpStatus.INTERNAL_SERVER_ERROR,
                    new ApiErrorResponse(LocalDateTime.now(), HttpStatus.INTERNAL_SERVER_ERROR, "INTERNAL SERVER ERROR : " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value()));
        } catch (JsonProcessingException e) {
            logger.error("Error in Tourism DepositStatements Service : " + e.getMessage());
            throw new CustomWebClientException(HttpStatus.INTERNAL_SERVER_ERROR,
                    new ApiErrorResponse(LocalDateTime.now(), HttpStatus.INTERNAL_SERVER_ERROR, "INTERNAL SERVER ERROR : " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value()));
        }

        statementsResponse = new DepositStatementsResponse();
        Collections.reverse(statements);
        statementsResponse.setStatements(statements);
        statementsResponse.setTotal_record(statements.size());
        statementsResponse.setOperation_time(DateUtils.getSysDateInStr("yyyy-MM-dd'T'HH:mm:ss"));

        logger.info(String.format("Channel Response : %s  ", statementsResponse.toString()));

        return statementsResponse;
    }
}
