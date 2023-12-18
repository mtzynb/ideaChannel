package com.rahand.idea.channel.wrapper.faraboom.service.login;

import com.rahand.idea.channel.config.FaraBoomConfig;
import com.rahand.idea.channel.exception.ApiErrorResponse;
import com.rahand.idea.channel.exception.CustomWebClientException;
import com.rahand.idea.channel.wrapper.faraboom.dto.BoomHeader;
import com.rahand.idea.channel.wrapper.faraboom.dto.InternetBankInfo;
import com.rahand.idea.channel.wrapper.faraboom.dto.OauthResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.Base64;

@Service
public class FaraBoomLoginService {

    @Autowired
    private FaraBoomConfig boomConfig;

    public String getBoomToken() {

        String boomToken = "";
//        String boomLoginUrl = boomConfig.getApiBaseUrl() + "/auth/market/login";
        String boomLoginUrl = "https://api.sandbox.faraboom.co /v1/auth/market/login";

        return boomToken;
    }

    public String getAccessToken(InternetBankInfo internetBankInfo) {

        String accessToken = "";
        String oauthLoginUrl = boomConfig.getOauthBaseUrl() + "/oauth/token";

        MultiValueMap<String, String> formData = new LinkedMultiValueMap<>();
        formData.add("grant_type", "password");
        formData.add("username", internetBankInfo.getUsername());
        formData.add("password", internetBankInfo.getPassword());

        RestTemplate restClient = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();

        BoomHeader boomHeader = BoomHeader.builder()
                .appKey(boomConfig.getAppKey())
                .tokenId(boomConfig.getTokenId())
                .bankId("BOOMIR")
                .acceptLanguage("fa")
                .accept(MediaType.APPLICATION_JSON_VALUE)
                .contentType(MediaType.APPLICATION_FORM_URLENCODED_VALUE)
                .deviceId("192.168.1.1")
                .clientIpAddress("192.168.1.1")
                .clientPlatformType("WEB")
                .clientDeviceId("192.168.1.1")
                .clientUserAgent("Rahand Idea Channel")
                .clientUserId("09126705277")
                .build();

        headers.add("Authorization", "Basic " + Base64.getEncoder().encodeToString(String.format("%s:%s", boomConfig.getAppKey(), boomConfig.getAppSecret()).getBytes(StandardCharsets.UTF_8)));
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

        HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(formData, headers);

        ResponseEntity<OauthResponseDto> response = restClient.exchange(oauthLoginUrl, HttpMethod.POST, entity, OauthResponseDto.class);

        if (response.getStatusCode().is2xxSuccessful()) {
            accessToken = response.getBody().getAccessToken();
        } else {
            throw new CustomWebClientException(response.getStatusCode(),
                    new ApiErrorResponse(LocalDateTime.now(), response.getStatusCode(), response.getBody().toString(), response.getStatusCodeValue()));
        }

        return accessToken;
    }

}
