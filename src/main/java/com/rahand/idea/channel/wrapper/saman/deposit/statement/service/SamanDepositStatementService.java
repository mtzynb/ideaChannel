package com.rahand.idea.channel.wrapper.saman.deposit.statement.service;

import com.rahand.idea.channel.config.SamanConfig;
import com.rahand.idea.channel.constant.SamanEndpoins;
import com.rahand.idea.channel.dto.deposit.DepositStatementsRequest;
import com.rahand.idea.channel.dto.deposit.DepositStatementsResponse;
import com.rahand.idea.channel.dto.deposit.Statement;
import com.rahand.idea.channel.enums.BankName;
import com.rahand.idea.channel.util.LogUtils;
import com.rahand.idea.channel.util.Utils;
import com.rahand.idea.channel.util.date.DateUtils;
import com.rahand.idea.channel.util.restclient.WebClientInstance;
import com.rahand.idea.channel.wrapper.saman.deposit.statement.dto.SamanDepositStatementRequest;
import com.rahand.idea.channel.wrapper.saman.deposit.statement.dto.SamanDepositStatementResponse;
import com.rahand.idea.channel.wrapper.saman.login.service.SamanLoginService;
import org.slf4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * @author aglitchyy
 * @created 31/10/2021
 */

@Component
public class SamanDepositStatementService {

    private SamanConfig samanConfig;
    private WebClientInstance webClient;
    private SamanLoginService loginService;
    private Logger logger = LogUtils.getLogger();

    public SamanDepositStatementService(SamanConfig samanConfig, WebClientInstance webClient, SamanLoginService loginService) {
        this.samanConfig = samanConfig;
        this.webClient = webClient;
        this.loginService = loginService;
    }

    public DepositStatementsResponse depositStatement(DepositStatementsRequest channelStatementsRequest) {
        logger.info("SAMAN => depositStatement() Service call started, channelStatementsRequest: {}", channelStatementsRequest.toString());

        SamanDepositStatementRequest requestBody = new SamanDepositStatementRequest();
        requestBody.setToken(loginService.getAccessToken());
        requestBody.setChannel(samanConfig.getChannel());
        requestBody.setDepositNumber(channelStatementsRequest.getDeposit_number());
        requestBody.setFromDate(channelStatementsRequest.getFrom_date());
        requestBody.setToDate(channelStatementsRequest.getTo_date());

        if (channelStatementsRequest.getLength() != null) {
            requestBody.setLength(channelStatementsRequest.getLength());
        } else {
            requestBody.setLength(1000);
        }

        if (channelStatementsRequest.getOffset() != null) {
            requestBody.setOffset(channelStatementsRequest.getOffset());
        } else {
            requestBody.setOffset(0);
        }

        if (channelStatementsRequest.getOrder() != null) {
            requestBody.setOrder(channelStatementsRequest.getOrder().toString());
        } else {
            requestBody.setOrder("ASC");
        }

        if (channelStatementsRequest.getAction() != null) {
            requestBody.setAction(channelStatementsRequest.getAction().toString());
        }
        if (channelStatementsRequest.getCustomer_number() != null) {
            requestBody.setCif(channelStatementsRequest.getCustomer_number());

        }
        if (channelStatementsRequest.getDescription() != null) {
            requestBody.setDescription(channelStatementsRequest.getDescription());
        }
        requestBody.setEnglishDescription("PER");

        logger.info("SAMAN => requestBody: {}", requestBody.toString());
        String baseUrl = samanConfig.getBaseUrl() + ":" + samanConfig.getDepositStatementPort();
//        String baseUrl = "https://kook.sb24.ir:9004";

        SamanDepositStatementResponse samanResponse = webClient.getWebClientInstance(baseUrl, MediaType.APPLICATION_JSON_VALUE, BankName.SAMAN.value())
                .post()
                .uri(SamanEndpoins.DEPOSIT_STATEMENTS)
                .acceptCharset(StandardCharsets.UTF_8)
                .body(Mono.just(requestBody), SamanDepositStatementRequest.class)
                .retrieve()
                .bodyToMono(SamanDepositStatementResponse.class)
                .elapsed()  // map the stream's time into our streams data
                .doOnNext(tuple -> logger.info("SAMAN => depositStatement() ****** Response time took {} Milliseconds ******", tuple.getT1()))
                .map(Tuple2::getT2) // after outputting the measurement, return the data only
                .block();

        if (samanResponse != null && samanResponse.getTotalRecord() != null && samanResponse.getTotalRecord() >= 0) {
            DepositStatementsResponse depositStatementsChannelResponse = convertSamanResponseToChannelResponse(samanResponse);
            logger.info("SAMAN => depositStatementsChannelResponse:{} ", depositStatementsChannelResponse.toString());
            return depositStatementsChannelResponse;
        }
        return null;
    }


    public DepositStatementsResponse convertSamanResponseToChannelResponse(SamanDepositStatementResponse samanResponse) {

        DepositStatementsResponse channelDepositStatementsResponse = new DepositStatementsResponse();
        List<Statement> channelStatementsList = new ArrayList<>();

        samanResponse.getStatements().forEach(samanStatement -> {

            Statement channelStatement = new Statement();

            channelStatement.setAgent_branch_code(samanStatement.getAgentBranchCode());
            channelStatement.setAgent_branch_name(samanStatement.getAgentBranchName());
            channelStatement.setBalance(samanStatement.getBalance().longValue());
            channelStatement.setBranch_code(samanStatement.getBranchCode());
            channelStatement.setBranch_name(samanStatement.getBranchName());
            channelStatement.setTransaction_date(Utils.splitString(samanStatement.getDate(), "\\+")[0]);
            channelStatement.setDescription(samanStatement.getDescription());
            channelStatement.setReference_number(samanStatement.getReferenceNumber());
            channelStatement.setSerial(samanStatement.getSerial());
            channelStatement.setSerial_number(samanStatement.getSerialNumber());
            channelStatement.setTransfer_amount(samanStatement.getTransferAmount().longValue());

            channelStatementsList.add(channelStatement);
        });

        channelDepositStatementsResponse.setStatements(channelStatementsList);
        channelDepositStatementsResponse.setOperation_time(DateUtils.getSysDateInStr("yyyy-MM-dd'T'HH:mm:ss"));
        channelDepositStatementsResponse.setTotal_record(samanResponse.getTotalRecord());

        return channelDepositStatementsResponse;
    }

}