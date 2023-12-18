package com.rahand.idea.channel.wrapper.middleeast.util;

import com.rahand.idea.channel.exception.ApiErrorResponse;
import com.rahand.idea.channel.exception.CustomWebClientException;
import com.rahand.idea.channel.exception.GeneralException;
import com.rahand.idea.channel.util.LogUtils;
import org.slf4j.Logger;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDateTime;
import java.util.Map;

@Component
public class RestClient {

    private Logger logger = LogUtils.getLogger();

    public String postFormUrlEncodedByWebClient(String url, Map inputMap, String serviceName, String clientName, String apiKey) {

        WebClient webClient = WebClient.create();

        String inputJson = MiddleEastUtil.generateInputJson(inputMap);
        String key = MiddleEastUtil.generateKey(clientName, serviceName, inputJson, apiKey);

        MultiValueMap<String, String> params = new LinkedMultiValueMap();
        params.add("parameters", inputJson);
        params.add("key", key);

        URI uri = null;
        try {
            uri = new URI(url);
        } catch (URISyntaxException e) {
            LogUtils.getLogger().error(e.getMessage());
            throw new GeneralException(e.getMessage());

        }

        return webClient.post()
                .uri(uri)
                .contentType(MediaType.parseMediaType("application/x-www-form-urlencoded; charset=UTF-8"))
                .body(BodyInserters.fromFormData(params))
                .retrieve()
                .bodyToMono(String.class)
                .block();

    }

    public String postFormUrlEncodedByRestTemplate(String url, Map inputMap, String serviceName, String clientName, String apiKey) {

        String outputJson = "";

        String inputJson = MiddleEastUtil.generateInputJson(inputMap);
        String key = MiddleEastUtil.generateKey(clientName, serviceName, inputJson,apiKey);

        MultiValueMap<String, String> params = new LinkedMultiValueMap();
        params.add("parameters", inputJson);
        params.add("key", key);

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.parseMediaType("application/x-www-form-urlencoded; charset=UTF-8"));
        HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(params, headers);
        ResponseEntity<String> response = null;
        logger.info(String.format("Request Post to %s  - Request Body : %s ",url,entity.getBody().toString()));

        try {
            response = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);
        } catch (HttpServerErrorException.InternalServerError serverError) {
            throw new CustomWebClientException(serverError.getStatusCode(),
                    new ApiErrorResponse(LocalDateTime.now(), serverError.getStatusCode(), serverError.getStatusText(), serverError.getRawStatusCode()));
        }

        outputJson = response.getBody();
        logger.info(String.format("Bank Response : %s  ",outputJson));

        return outputJson;
    }

}
