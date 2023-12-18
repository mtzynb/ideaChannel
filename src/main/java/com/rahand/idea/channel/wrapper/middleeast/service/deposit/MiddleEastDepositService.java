package com.rahand.idea.channel.wrapper.middleeast.service.deposit;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rahand.idea.channel.config.MiddleEastConfig;
import com.rahand.idea.channel.dto.deposit.*;
import com.rahand.idea.channel.exception.ApiErrorResponse;
import com.rahand.idea.channel.exception.CustomWebClientException;
import com.rahand.idea.channel.exception.GeneralException;
import com.rahand.idea.channel.util.LogUtils;
import com.rahand.idea.channel.util.date.DateUtils;
import com.rahand.idea.channel.wrapper.middleeast.dto.ClientInfo;
import com.rahand.idea.channel.wrapper.middleeast.util.MiddleEastUtil;
import com.rahand.idea.channel.wrapper.middleeast.util.RestClient;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;

@Service
public class MiddleEastDepositService {

    @Autowired
    private MiddleEastConfig middleEastConfig;
    @Autowired
    private RestClient restClient;

    private Logger logger = LogUtils.getLogger();

    private ClientInfo getClientInfo(String cif) {

        List<ClientInfo> clients = middleEastConfig.getClientInfo();
        Optional<ClientInfo> clientInfoOptional = clients.stream().filter(c -> c.getCif().equals(cif)).findAny();
        ClientInfo clientInfo = clientInfoOptional.orElseThrow(() -> new CustomWebClientException(HttpStatus.BAD_REQUEST,
                new ApiErrorResponse(LocalDateTime.now(), HttpStatus.BAD_REQUEST, "شماره مشتری نامتعبراست یا در White list بانک برای ارائه سرویس وجود ندارد", HttpStatus.BAD_REQUEST.value())));
        return clientInfo;

    }


    public DepositBalanceResponse getDepositBalance(DepositBalanceRequest request) {

        logger.info("Middle East => depositBalance() Service call started ... channelStatementsRequest: " + request.toString());

        ClientInfo clientInfo = getClientInfo(request.getCustomer_number());

        DepositBalanceResponse balanceResponse = new DepositBalanceResponse();

        String serviceName = "balance";
        String url = middleEastConfig.getBaseUrl() + "/serve/" + clientInfo.getClientName() + "/" + serviceName;

        Map inputMap = new HashMap();
        inputMap.put("accountNo", request.getDeposit_number());

        String response = restClient.postFormUrlEncodedByRestTemplate(url, inputMap, serviceName,
                clientInfo.getClientName(), clientInfo.getApiKey());

        if (response.contains("errorCode")) {
            Map<String, Object> errorMap = new HashMap<>();
            errorMap = (Map<String, Object>) MiddleEastUtil.jsonToObject(response, errorMap);

            if (errorMap.get("errorCode").equals("11")) {
                throw new CustomWebClientException(HttpStatus.BAD_REQUEST,
                        new ApiErrorResponse(LocalDateTime.now(), HttpStatus.BAD_REQUEST, response, HttpStatus.BAD_REQUEST.value()));
            } else {
                throw new CustomWebClientException(HttpStatus.INTERNAL_SERVER_ERROR,
                        new ApiErrorResponse(LocalDateTime.now(), HttpStatus.INTERNAL_SERVER_ERROR, response, HttpStatus.INTERNAL_SERVER_ERROR.value()));
            }
        }

        Map<String, Object> responseMap = new HashMap<>();
        responseMap = (Map<String, Object>) MiddleEastUtil.jsonToObject(response, responseMap);

        if (responseMap.isEmpty()) {
            responseMap.put("errorCode", "11");
            responseMap.put("title", "شماره حساب معتبر نمی باشد");

            try {
                response = new ObjectMapper().writeValueAsString(responseMap);
            } catch (JsonProcessingException e) {
                LogUtils.getLogger().error(e.getMessage());
                throw new GeneralException(e.getMessage());
            }

            throw new CustomWebClientException(HttpStatus.BAD_REQUEST,
                    new ApiErrorResponse(LocalDateTime.now(), HttpStatus.BAD_REQUEST, response, HttpStatus.BAD_REQUEST.value()));

        } else {
            Number balance = (Number) responseMap.get("balance");
            Number availableBalance = (Number) responseMap.get("availableBalance");
            Number blockedAmount = (Number) responseMap.get("freezAmount");

            balanceResponse.setBalance(balance.longValue());
            balanceResponse.setAvailable_balance(availableBalance.longValue());
            balanceResponse.setBlocked_amount(blockedAmount.longValue());
            balanceResponse.setDeposit_number(request.getDeposit_number());
            balanceResponse.setOperation_time(DateUtils.getSysDateInStr("yyyy-MM-dd'T'HH:mm:ss"));
            balanceResponse.setCurrency("");
            balanceResponse.setBranchCode("");
            balanceResponse.setExtra_available_balance(0l);
        }

        logger.info(String.format("Channel Response : %s  ", balanceResponse.toString()));

        return balanceResponse;
    }

    public DepositStatementsResponse getDepositStatements(DepositStatementsRequest request) {

        logger.info("Middle East => depositStatement() Service call started, channelStatementsRequest: {}", request.toString());

        ClientInfo clientInfo = getClientInfo(request.getCustomer_number());

        DepositStatementsResponse statementsResponses = new DepositStatementsResponse();

        String serviceName = "getStatements";
        String url = middleEastConfig.getBaseUrl() + "/serve/" + clientInfo.getClientName() + "/" + serviceName;

        Map inputMap = new HashMap();
        // DateUtils.checkTimeInterval(request.getFrom_date(), request.getTo_date());
        inputMap.put("accountNo", request.getDeposit_number());
        inputMap.put("fromDate", MiddleEastUtil.toPersianDate(request.getFrom_date()));
        inputMap.put("toDate", MiddleEastUtil.toPersianDate(request.getTo_date()));

        String response = restClient.postFormUrlEncodedByRestTemplate(url, inputMap, serviceName,
                clientInfo.getClientName(), clientInfo.getApiKey());

        if (response.contains("errorCode")) {
            Map<String, Object> errorMap = new HashMap<>();
            errorMap = (Map<String, Object>) MiddleEastUtil.jsonToObject(response, errorMap);

            if (errorMap.get("errorCode").equals("11")) {
                throw new CustomWebClientException(HttpStatus.BAD_REQUEST,
                        new ApiErrorResponse(LocalDateTime.now(), HttpStatus.BAD_REQUEST, response, HttpStatus.BAD_REQUEST.value()));
            } else {
                throw new CustomWebClientException(HttpStatus.INTERNAL_SERVER_ERROR,
                        new ApiErrorResponse(LocalDateTime.now(), HttpStatus.INTERNAL_SERVER_ERROR, response, HttpStatus.INTERNAL_SERVER_ERROR.value()));
            }
        }

        List<Map<String, Object>> responseList = new ArrayList<>();
        responseList = (List<Map<String, Object>>) MiddleEastUtil.jsonToObject(response, responseList);

        MiddleEastUtil.depositNumberValidation(request.getDeposit_number());

        List<Statement> statements = new ArrayList<>();

        for (int i = 0; i < responseList.size(); i++) {

            Map<String, Object> transactionItem = responseList.get(i);
            Long transactionDateInMilliseconds = (Long) transactionItem.get("date");
            Long fromDateInMilliseconds = DateUtils.getDateFromStr(request.getFrom_date(),"yyyy-MM-dd'T'HH:mm:ss").getTime();
            Long toDateInMilliseconds = DateUtils.getDateFromStr(request.getTo_date(),"yyyy-MM-dd'T'HH:mm:ss").getTime();

            if (transactionDateInMilliseconds > toDateInMilliseconds || transactionDateInMilliseconds < fromDateInMilliseconds){
                continue;
            }

            Statement statement = new Statement();
            String transactionType = String.valueOf(transactionItem.get("type"));
            Number transactionAmount = (Number) transactionItem.get("amount");
            Number balance = (Number) transactionItem.get("balance");

            if (transactionType.equals("DR")) {
                transactionAmount = transactionAmount.longValue() * -1;
            }


            statement.setBalance(balance.longValue());
            statement.setTransfer_amount(transactionAmount.longValue());
            statement.setDescription(String.valueOf(transactionItem.get("desc")));
            statement.setTransaction_date(DateUtils.timestampToDate((Long) transactionItem.get("date")));
            statement.setReference_number(String.valueOf(transactionItem.get("trankey")));
            statement.setBranch_code("");
            statement.setAgent_branch_code("");
            statement.setBranch_name("");
            statement.setAgent_branch_name("");
            statement.setSerial(0);
            statement.setSerial_number("");
            statements.add(statement);
        }

        Collections.reverse(statements);
        statementsResponses.setStatements(statements);
        statementsResponses.setTotal_record(statements.size());
        statementsResponses.setOperation_time(DateUtils.getSysDateInStr("yyyy-MM-dd'T'HH:mm:ss"));

        logger.info(String.format("Channel Response : %s  ", statementsResponses.toString()));

        return statementsResponses;
    }
}
