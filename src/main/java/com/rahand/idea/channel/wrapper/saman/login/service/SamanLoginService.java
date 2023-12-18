package com.rahand.idea.channel.wrapper.saman.login.service;

import com.rahand.idea.channel.config.SamanConfig;
import com.rahand.idea.channel.constant.SamanEndpoins;
import com.rahand.idea.channel.enums.BankName;
import com.rahand.idea.channel.util.LogUtils;
import com.rahand.idea.channel.util.Utils;
import com.rahand.idea.channel.util.date.DateUtils;
import com.rahand.idea.channel.util.restclient.WebClientInstance;
import com.rahand.idea.channel.wrapper.saman.login.dto.LoginRequest;
import com.rahand.idea.channel.wrapper.saman.login.dto.LoginResponse;
import org.slf4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author aglitchyy
 * @created 31/10/2021
 */

@Component
public class SamanLoginService {

    private SamanConfig samanConfig;
    private WebClientInstance webClient;
    private static String samanLoginToken;
    public static String samanLoginExpTime = "2021-11-06T13:41:52";
    private final Lock lock = new ReentrantLock();

    private Logger logger = LogUtils.getLogger();

    public SamanLoginService(SamanConfig samanConfig, WebClientInstance webClient) {
        this.samanConfig = samanConfig;
        this.webClient = webClient;
    }

    private LoginResponse login() {

        logger.info("SAMAN => login() Service call started, samanLoginExpTime is => {}", samanLoginExpTime);

        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setChannel(samanConfig.getChannel());
        loginRequest.setUsername(samanConfig.getUsername());
        loginRequest.setPassword(samanConfig.getPassword());
        loginRequest.setSecretkey(samanConfig.getSecretKey());

        String baseUrl = samanConfig.getBaseUrl() + ":" + samanConfig.getLoginPort();
//            String baseUrl = "https://kook.sb24.ir:9000";

        LoginResponse loginResponse = webClient.getWebClientInstance(baseUrl, MediaType.APPLICATION_JSON_VALUE, BankName.SAMAN.value())
                .post()
                .uri(SamanEndpoins.LOGIN)
                .acceptCharset(StandardCharsets.UTF_8)
                .body(Mono.just(loginRequest), LoginRequest.class)
                .retrieve()
                .bodyToMono(LoginResponse.class)
                .elapsed()  // map the stream's time into our streams data
                .doOnNext(tuple -> logger.info("SAMAN => login() ****** Response time took {} Milliseconds ******", tuple.getT1()))
                .map(Tuple2::getT2) // after outputting the measurement, return the data only
                .block();

        logger.info("SAMAN => loginResponse: " + loginResponse.toString());

        if (loginResponse.getToken() != null && loginResponse.getExpiration() != null) {

            if (loginResponse.getExpiration().contains("+")) {
                samanLoginExpTime = Utils.splitString(loginResponse.getExpiration(), "\\+")[0];
            }
            samanLoginToken = loginResponse.getToken();
            return loginResponse;
        }
        return null;
    }

    public String getAccessToken() {

        logger.info("SAMAN => getAccessToken() Service call started, with samanLoginExpTime => {}", samanLoginExpTime);

        if (Calendar.getInstance().after(toCalendar(DateUtils.getDateFromStr(samanLoginExpTime, "yyyy-MM-dd'T'HH:mm:ss")))) {
            if (lock.tryLock()) {
                try {
                    login();
                } finally {
                    lock.unlock();
                }
            }
        }
        logger.info("SAMAN => getAccessToken() Service call End, with samanLoginExpTime => {}", samanLoginExpTime);
        return samanLoginToken;
    }

    private static Calendar toCalendar(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MINUTE, -5);
        return cal;
    }

}
