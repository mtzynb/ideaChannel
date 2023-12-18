package com.rahand.idea.channel.wrapper.faraboom.service.deposit;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rahand.idea.channel.config.FaraBoomConfig;
import com.rahand.idea.channel.dto.deposit.*;
import com.rahand.idea.channel.exception.ApiErrorResponse;
import com.rahand.idea.channel.exception.CustomWebClientException;
import com.rahand.idea.channel.util.LogUtils;
import com.rahand.idea.channel.util.date.DateUtils;
import com.rahand.idea.channel.wrapper.faraboom.dto.BoomHeader;
import com.rahand.idea.channel.wrapper.faraboom.service.login.FaraBoomLoginService;
import com.rahand.idea.channel.wrapper.faraboom.util.FaraBoomUtil;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.*;

@Service
public class FaraBoomDepositService {

    private Logger logger = LogUtils.getLogger();

    @Autowired
    private FaraBoomConfig boomConfig;
    @Autowired
    private FaraBoomLoginService loginService;

    public DepositBalanceResponse getDepositBalance(DepositBalanceRequest request) {

        logger.info("Faraboom => depositBalance() Service call started ... channelStatementsRequest: " + request.toString());

        String url = boomConfig.getApiBaseUrl() + "/deposits/balance";

        DepositBalanceResponse balanceResponse = null;

        String bankId = request.getBankName().name().split("[_]")[1];
        BoomHeader boomHeader = BoomHeader.builder()
                .appKey(boomConfig.getAppKey())
                .tokenId(boomConfig.getTokenId())
                .bankId(bankId)
                .acceptLanguage("fa")
                .accept(MediaType.APPLICATION_JSON_VALUE)
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .deviceId("192.168.1.1")
                .clientIpAddress("192.168.1.1")
                .clientPlatformType("WEB")
                .clientDeviceId("192.168.1.1")
                .clientUserAgent("Rahand Idea Channel")
                .clientUserId("09126705277")
                .build();

        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "Bearer " + loginService.getAccessToken(boomConfig.getInternetBankInfo()));
        headers.add("App-Key", boomHeader.getAppKey());
        headers.add("Token-Id", boomHeader.getTokenId());
        headers.add("Bank-Id", boomHeader.getBankId());
        headers.add("Accept-Language", boomHeader.getAcceptLanguage());
        headers.add("CONTENT-TYPE", boomHeader.getContentType());
        headers.add("ACCEPT", boomHeader.getAccept());
        headers.add("Device-Id", boomHeader.getDeviceId());
        headers.add("CLIENT-IP-ADDRESS", boomHeader.getClientIpAddress());
        headers.add("CLIENT-PLATFORM-TYPE", boomHeader.getClientPlatformType());
        headers.add("CLIENT-DEVICE-ID", boomHeader.getClientDeviceId());
        headers.add("CLIENT-USER-AGENT", boomHeader.getClientUserAgent());
        headers.add("CLIENT-USER-ID", boomHeader.getClientUserId());

        LinkedHashMap<String, String> requestMap = new LinkedHashMap<>();
        requestMap.put("deposit", request.getDeposit_number());
        HttpEntity httpEntity = new HttpEntity<>(requestMap, headers);


        RestTemplate restClient = new RestTemplate();
        ResponseEntity<String> responseEntity = restClient.exchange(url, HttpMethod.POST, httpEntity, String.class);
        try {
            if (responseEntity.getStatusCode().is2xxSuccessful()) {
                ObjectMapper mapper = new ObjectMapper();
                Map responseMap = mapper.readValue(responseEntity.getBody(), Map.class);
                List<Map> deposits = (List) responseMap.get("deposits");
                balanceResponse = new DepositBalanceResponse();
                balanceResponse.setDeposit_number(String.valueOf(deposits.get(0).get("deposit")));
                balanceResponse.setBalance((Long) deposits.get(0).get("balance"));
                balanceResponse.setAvailable_balance(deposits.get(0).get("available_balance") != null ? (Long) deposits.get(0).get("available_balance") : 0l);
                balanceResponse.setBlocked_amount(deposits.get(0).get("blocked_amount") != null ? (Long) deposits.get(0).get("blocked_amount") : 0l);
                balanceResponse.setCurrency("");
                balanceResponse.setBranchCode("");
                balanceResponse.setExtra_available_balance(0l);
                balanceResponse.setOperation_time(DateUtils.getSysDateInStr("yyyy-MM-dd'T'HH:mm:ss"));

            } else {
                throw new CustomWebClientException(responseEntity.getStatusCode(),
                        new ApiErrorResponse(LocalDateTime.now(), responseEntity.getStatusCode(), responseEntity.getBody().toString(), responseEntity.getStatusCodeValue()));
            }
        } catch (JsonMappingException e) {
            throw new CustomWebClientException(responseEntity.getStatusCode(),
                    new ApiErrorResponse(LocalDateTime.now(), responseEntity.getStatusCode(), responseEntity.getBody().toString(), responseEntity.getStatusCodeValue()));
        } catch (JsonProcessingException e) {
            throw new CustomWebClientException(responseEntity.getStatusCode(),
                    new ApiErrorResponse(LocalDateTime.now(), responseEntity.getStatusCode(), responseEntity.getBody().toString(), responseEntity.getStatusCodeValue()));
        } catch (HttpServerErrorException.InternalServerError e) {
            throw new CustomWebClientException(responseEntity.getStatusCode(),
                    new ApiErrorResponse(LocalDateTime.now(), responseEntity.getStatusCode(), responseEntity.getBody().toString(), responseEntity.getStatusCodeValue()));
        }

        logger.info(String.format("Channel Response : %s  ", balanceResponse.toString()));

        return balanceResponse;
    }

    public DepositStatementsResponse getDepositStatements(DepositStatementsRequest request) {

        logger.info("Faraboom => depositStatement() Service call started, channelStatementsRequest: {}", request.toString());

        String url = String.format("%s/deposits/%s/statements", boomConfig.getApiBaseUrl(), request.getDeposit_number());

        DepositStatementsResponse statementsResponse = null;
        List<Statement> statements = new ArrayList<>();

        String bankId = request.getBankName().name().split("[_]")[1];
        BoomHeader boomHeader = BoomHeader.builder()
                .appKey(boomConfig.getAppKey())
                .tokenId(boomConfig.getTokenId())
                .bankId(bankId)
                .acceptLanguage("fa")
                .accept(MediaType.APPLICATION_JSON_VALUE)
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .deviceId("192.168.1.1")
                .clientIpAddress("192.168.1.1")
                .clientPlatformType("WEB")
                .clientDeviceId("192.168.1.1")
                .clientUserAgent("Rahand Idea Channel")
                .clientUserId("09126705277")
                .build();

        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "Bearer " + loginService.getAccessToken(boomConfig.getInternetBankInfo()));
        headers.add("App-Key", boomHeader.getAppKey());
        headers.add("Token-Id", boomHeader.getTokenId());
        headers.add("Bank-Id", boomHeader.getBankId());
        headers.add("Accept-Language", boomHeader.getAcceptLanguage());
        headers.add("CONTENT-TYPE", boomHeader.getContentType());
        headers.add("ACCEPT", boomHeader.getAccept());
        headers.add("Device-Id", boomHeader.getDeviceId());
        headers.add("CLIENT-IP-ADDRESS", boomHeader.getClientIpAddress());
        headers.add("CLIENT-PLATFORM-TYPE", boomHeader.getClientPlatformType());
        headers.add("CLIENT-DEVICE-ID", boomHeader.getClientDeviceId());
        headers.add("CLIENT-USER-AGENT", boomHeader.getClientUserAgent());
        headers.add("CLIENT-USER-ID", boomHeader.getClientUserId());

        request.setOffset(0);
        request.setLength(1000);
        request.setAction(ActionType.CREDIT);
        request.setOrder(OrderType.ASC);
        LinkedHashMap<String, Object> creditRequestMap = new LinkedHashMap<>();
        creditRequestMap.put("deposit_number", request.getDeposit_number());
        creditRequestMap.put("from_date", request.getFrom_date());
        creditRequestMap.put("to_date", request.getTo_date());
        creditRequestMap.put("offset", request.getOffset());
        creditRequestMap.put("length", request.getLength());
        creditRequestMap.put("order", request.getOrder().name());
        creditRequestMap.put("action", request.getAction().name());

        HttpEntity creditHttpEntity = new HttpEntity<>(creditRequestMap, headers);

        RestTemplate creditRestClient = new RestTemplate();
        ResponseEntity<String> creditResponseEntity = null;
        Map creditResponseMap = null;
        try {
            creditResponseEntity = creditRestClient.exchange(url, HttpMethod.POST, creditHttpEntity, String.class);
            if (creditResponseEntity.getStatusCode().is2xxSuccessful()) {
                ObjectMapper mapper = new ObjectMapper();
                creditResponseMap = mapper.readValue(creditResponseEntity.getBody(), Map.class);
                boolean hasNextPage = (Boolean) creditResponseMap.get("has_next_page");
                List creditStatementsList = (List) creditResponseMap.get("statements");
                Statement creditStatement = null;
                for (int i = 0; i < creditStatementsList.size(); i++) {
                    Map creditStatementMap = (Map) creditStatementsList.get(i);
                    creditStatement = new Statement();
                    creditStatement.setDateTime((Long) creditStatementMap.get("transaction_date"));
                    Number balance = (Number) creditStatementMap.get("balance");
                    creditStatement.setBalance(balance.longValue());
                    Number transferAmount = (Number) creditStatementMap.get("transfer_amount");
                    creditStatement.setTransfer_amount(transferAmount.longValue());
                    creditStatement.setDescription(String.valueOf(creditStatementMap.get("description")));
                    creditStatement.setTransaction_date(DateUtils.timestampToDate((Long) creditStatementMap.get("transaction_date")));
                    creditStatement.setReference_number(String.valueOf(creditStatementMap.get("reference_number")));
                    creditStatement.setBranch_code(String.valueOf(creditStatementMap.get("branch_code")));
                    creditStatement.setAgent_branch_code(String.valueOf(creditStatementMap.get("agent_branch_code")));
                    creditStatement.setBranch_name(String.valueOf(creditStatementMap.get("branch_name")));
                    creditStatement.setAgent_branch_name(String.valueOf(creditStatementMap.get("agent_branch_name")));
                    creditStatement.setSerial((Integer) creditStatementMap.get("statement_serial"));
                    creditStatement.setSerial_number(String.valueOf(creditStatementMap.get("serial_number")));
                    statements.add(creditStatement);
                }
            } else {
                throw new CustomWebClientException(creditResponseEntity.getStatusCode(),
                        new ApiErrorResponse(LocalDateTime.now(), creditResponseEntity.getStatusCode(), creditResponseEntity.getBody().toString(), creditResponseEntity.getStatusCodeValue()));
            }
        } catch (JsonProcessingException e) {
            throw new CustomWebClientException(creditResponseEntity.getStatusCode(),
                    new ApiErrorResponse(LocalDateTime.now(), creditResponseEntity.getStatusCode(), creditResponseEntity.getBody().toString(), creditResponseEntity.getStatusCodeValue()));
        } catch (RestClientException e) {
            throw new CustomWebClientException(creditResponseEntity.getStatusCode(),
                    new ApiErrorResponse(LocalDateTime.now(), creditResponseEntity.getStatusCode(), creditResponseEntity.getBody().toString(), creditResponseEntity.getStatusCodeValue()));
        }

        request.setOffset(0);
        request.setLength(30);
        request.setAction(ActionType.DEBIT);
        request.setOrder(OrderType.ASC);
        LinkedHashMap<String, Object> debitRequestMap = new LinkedHashMap<>();
        debitRequestMap.put("deposit_number", request.getDeposit_number());
        debitRequestMap.put("from_date", request.getFrom_date());
        debitRequestMap.put("to_date", request.getTo_date());
        debitRequestMap.put("offset", request.getOffset());
        debitRequestMap.put("length", request.getLength());
        debitRequestMap.put("order", request.getOrder().name());
        debitRequestMap.put("action", request.getAction().name());

        HttpEntity debitHttpEntity = new HttpEntity<>(debitRequestMap, headers);

        RestTemplate debitRestClient = new RestTemplate();
        ResponseEntity<String> debitResponseEntity = null;
        Map debitResponseMap = null;
        try {
            debitResponseEntity = debitRestClient.exchange(url, HttpMethod.POST, debitHttpEntity, String.class);
            if (debitResponseEntity.getStatusCode().is2xxSuccessful()) {
                ObjectMapper mapper = new ObjectMapper();
                debitResponseMap = mapper.readValue(debitResponseEntity.getBody(), Map.class);
                Statement debitStatement = null;
                boolean hasNextPage = (Boolean) creditResponseMap.get("has_next_page");
                List debitStatementsList = (List) debitResponseMap.get("statements");
                Statement creditStatement = null;
                for (int i = 0; i < debitStatementsList.size(); i++) {
                    Map debitStatementMap = (Map) debitStatementsList.get(i);
                    debitStatement = new Statement();
                    debitStatement.setDateTime((Long) debitStatementMap.get("transaction_date"));
                    Number balance = (Number) debitStatementMap.get("balance");
                    debitStatement.setBalance(balance.longValue());
                    Number transferAmount = (Number) debitStatementMap.get("transfer_amount");
                    debitStatement.setTransfer_amount(transferAmount.longValue());
                    debitStatement.setDescription(String.valueOf(debitStatementMap.get("description")));
                    debitStatement.setTransaction_date(DateUtils.timestampToDate((Long) debitStatementMap.get("transaction_date")));
                    debitStatement.setReference_number(String.valueOf(debitStatementMap.get("reference_number")));
                    debitStatement.setBranch_code(String.valueOf(debitStatementMap.get("branch_code")));
                    debitStatement.setAgent_branch_code(String.valueOf(debitStatementMap.get("agent_branch_code")));
                    debitStatement.setBranch_name(String.valueOf(debitStatementMap.get("branch_name")));
                    debitStatement.setAgent_branch_name(String.valueOf(debitStatementMap.get("agent_branch_name")));
                    debitStatement.setSerial((Integer) debitStatementMap.get("statement_serial"));
                    debitStatement.setSerial_number(String.valueOf(debitStatementMap.get("serial_number")));
                    statements.add(debitStatement);
                }
            } else {
                throw new CustomWebClientException(creditResponseEntity.getStatusCode(),
                        new ApiErrorResponse(LocalDateTime.now(), debitResponseEntity.getStatusCode(), debitResponseEntity.getBody().toString(), debitResponseEntity.getStatusCodeValue()));
            }
        } catch (JsonProcessingException e) {
            throw new CustomWebClientException(creditResponseEntity.getStatusCode(),
                    new ApiErrorResponse(LocalDateTime.now(), debitResponseEntity.getStatusCode(), debitResponseEntity.getBody().toString(), debitResponseEntity.getStatusCodeValue()));
        } catch (RestClientException e) {
            throw new CustomWebClientException(creditResponseEntity.getStatusCode(),
                    new ApiErrorResponse(LocalDateTime.now(), debitResponseEntity.getStatusCode(), debitResponseEntity.getBody().toString(), debitResponseEntity.getStatusCodeValue()));
        }


        statementsResponse = new DepositStatementsResponse();
        statements.sort((Statement s, Statement s2) -> s.getDateTime().compareTo(s2.getDateTime()));
        statementsResponse.setStatements(statements);
        statementsResponse.setTotal_record(statements.size());
        statementsResponse.setOperation_time(DateUtils.getSysDateInStr("yyyy-MM-dd'T'HH:mm:ss"));

        logger.info(String.format("Channel Response : %s  ", statementsResponse.toString()));

        return statementsResponse;
    }
}
