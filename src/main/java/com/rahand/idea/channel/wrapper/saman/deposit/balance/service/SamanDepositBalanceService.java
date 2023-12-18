package com.rahand.idea.channel.wrapper.saman.deposit.balance.service;

import com.rahand.idea.channel.config.SamanConfig;
import com.rahand.idea.channel.constant.SamanEndpoins;
import com.rahand.idea.channel.dto.deposit.DepositBalanceRequest;
import com.rahand.idea.channel.dto.deposit.DepositBalanceResponse;
import com.rahand.idea.channel.enums.BankName;
import com.rahand.idea.channel.util.LogUtils;
import com.rahand.idea.channel.util.date.DateUtils;
import com.rahand.idea.channel.util.restclient.WebClientInstance;
import com.rahand.idea.channel.wrapper.saman.deposit.balance.dto.SamanDepositBalanceRequest;
import com.rahand.idea.channel.wrapper.saman.deposit.balance.dto.SamanDepositBalanceResponse;
import com.rahand.idea.channel.wrapper.saman.login.service.SamanLoginService;
import org.slf4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

import java.nio.charset.StandardCharsets;

/**
 * @author aglitchyy
 * @created 31/10/2021
 */

@Component
public class SamanDepositBalanceService {

    private SamanConfig samanConfig;
    private WebClientInstance webClient;
    private SamanLoginService loginService;
    private Logger logger = LogUtils.getLogger();


    public SamanDepositBalanceService(SamanConfig samanConfig, WebClientInstance webClient, SamanLoginService loginService) {
        this.samanConfig = samanConfig;
        this.webClient = webClient;
        this.loginService = loginService;
    }

    public DepositBalanceResponse depositBalance(DepositBalanceRequest channelBalanceRequest) {

        logger.info("SAMAN => depositBalance() Service call started, channelBalanceRequest: {}", channelBalanceRequest.toString());

        SamanDepositBalanceRequest requestBody = new SamanDepositBalanceRequest();
        requestBody.setChannel(samanConfig.getChannel());
        requestBody.setCif(channelBalanceRequest.getCustomer_number());
        requestBody.setDepositNumber(channelBalanceRequest.getDeposit_number());
        requestBody.setToken(loginService.getAccessToken());

        String baseUrl = samanConfig.getBaseUrl() + ":" + samanConfig.getDepositBalancePort();
//        String baseUrl = "https://kook.sb24.ir:9007";

        SamanDepositBalanceResponse samanResponse = webClient.getWebClientInstance(baseUrl, MediaType.APPLICATION_JSON_VALUE, BankName.SAMAN.value())
                .post()
                .uri(SamanEndpoins.DEPOSIT_BALANCE)
                .acceptCharset(StandardCharsets.UTF_8)
                .body(Mono.just(requestBody), SamanDepositBalanceRequest.class)
                .retrieve()
                .bodyToMono(SamanDepositBalanceResponse.class)
                .elapsed()  // map the stream's time into our streams data
                .doOnNext(tuple -> logger.info("SAMAN => depositBalance() ****** Response time took {} Milliseconds ******", tuple.getT1()))
                .map(Tuple2::getT2) // after outputting the measurement, return the data only
                .block();

        if (samanResponse != null && samanResponse.getBalance() != null) {
            DepositBalanceResponse depositBalanceChannelResponse = convertSamanResponseToChannelResponse(samanResponse);
            logger.info("SAMAN => depositBalanceChannelResponse: " + depositBalanceChannelResponse.toString());

            return depositBalanceChannelResponse;
        }

        return null;
    }

    public DepositBalanceResponse convertSamanResponseToChannelResponse(SamanDepositBalanceResponse samanDepositBalanceResponse) {

        DepositBalanceResponse depositBalanceChannelResponse = new DepositBalanceResponse();

        depositBalanceChannelResponse.setOperation_time(DateUtils.getSysDateInStr("yyyy-MM-dd'T'HH:mm:ss"));
        depositBalanceChannelResponse.setDeposit_number(samanDepositBalanceResponse.getDepositNumber());
//        depositBalanceChannelResponse.setDeposit_status(samanDepositBalanceResponse.getDepositStatus());
        depositBalanceChannelResponse.setBalance(samanDepositBalanceResponse.getBalance().longValue());
        depositBalanceChannelResponse.setBlocked_amount(samanDepositBalanceResponse.getBlockedAmount().longValue());
        depositBalanceChannelResponse.setAvailable_balance(samanDepositBalanceResponse.getAvailableBalance().longValue());
        depositBalanceChannelResponse.setExtra_available_balance(samanDepositBalanceResponse.getExtraAvailableBalance().longValue());
        depositBalanceChannelResponse.setCurrency(samanDepositBalanceResponse.getCurrency());
        depositBalanceChannelResponse.setBranchCode(samanDepositBalanceResponse.getBranchCode());

        return depositBalanceChannelResponse;
    }


}
