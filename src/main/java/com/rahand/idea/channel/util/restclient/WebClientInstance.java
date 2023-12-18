package com.rahand.idea.channel.util.restclient;

import com.rahand.idea.channel.enums.BankName;
import com.rahand.idea.channel.exception.ApiErrorResponse;
import com.rahand.idea.channel.exception.CustomWebClientException;
import com.rahand.idea.channel.util.LogUtils;
import com.rahand.idea.channel.wrapper.saman.login.service.SamanLoginService;
import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.handler.timeout.WriteTimeoutHandler;
import org.slf4j.Logger;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.ClientRequest;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.ExchangeFilterFunction;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import reactor.netty.http.client.HttpClient;

import java.time.Duration;
import java.time.LocalDateTime;

@Component
public class WebClientInstance {

    private Logger logger = LogUtils.getLogger();

    public WebClient getWebClientInstance(String baseurl, String mediaType, String provider) {
        return WebClient.builder()
                .baseUrl(baseurl)
                .defaultHeader(HttpHeaders.CONTENT_TYPE, mediaType)
                .defaultHeader(HttpHeaders.USER_AGENT, "Rahand Idea Channel")
                .clientConnector(new ReactorClientHttpConnector(HttpClient.create().responseTimeout(Duration.ofSeconds(45))))
                .clientConnector(new ReactorClientHttpConnector(HttpClient.create().doOnConnected(connection -> connection
                        .addHandler(new ReadTimeoutHandler(45))
                        .addHandler(new WriteTimeoutHandler(45)))))
                .clientConnector(new ReactorClientHttpConnector(HttpClient.create().option(ChannelOption.CONNECT_TIMEOUT_MILLIS, 45000)))
                .filter(logRequest())
                .filter(errorResponseHandlerAndLogResponse(provider))
//                .filter(logResponse())
                .build();
    }
    // ***************************** Request *****************************
    private ExchangeFilterFunction logRequest() {
        return ExchangeFilterFunction.ofRequestProcessor(request -> {
            logMethodAndUrl(request);
            logReqHeaders(request);

            return Mono.just(request);
        });
    }

    private void logReqHeaders(ClientRequest request) {
        request.headers().forEach((name, values) -> {
            values.forEach(value -> {
                logger.debug("Req Header => {}={}", name, value);
            });
        });
    }

    private void logMethodAndUrl(ClientRequest request) {
        StringBuilder sb = new StringBuilder();
        sb.append("Request ");
        sb.append(request.method().name());
        sb.append(" to ");
        sb.append(request.url());

        logger.info(sb.toString());
    }

    // ***************************** Response *****************************
    public ExchangeFilterFunction logResponse() {
        return ExchangeFilterFunction.ofResponseProcessor(response -> {

            logResStatus(response);
            logResHeaders(response);

            return logResBody(response);
        });
    }

    private void logResHeaders(ClientResponse response) {
        response.headers().asHttpHeaders().forEach((name, values) -> {
            values.forEach(value -> {
                logger.debug("Res Header => {}={}", name, value);
            });
        });
    }

    private void logResStatus(ClientResponse response) {
        HttpStatus status = response.statusCode();
        logger.info("Returned status code {} ({})", status.value(), status.getReasonPhrase());
    }

    private Mono<ClientResponse> logResBody(ClientResponse response) {
        if (response.statusCode() != null && (response.statusCode().is4xxClientError() || response.statusCode().is5xxServerError())) {
            return response.bodyToMono(String.class)
                    .flatMap(body -> {
                        logger.info("Error Response Body is {}", body);
                        return Mono.just(response);
                    });
        } else {
            return Mono.just(response);
        }
    }

    public ExchangeFilterFunction errorResponseHandlerAndLogResponse(String provider) {

        return ExchangeFilterFunction.ofResponseProcessor(response -> {

            logResStatus(response);
            logResHeaders(response);

            if (response.statusCode() != null && (response.statusCode().is5xxServerError() || response.statusCode().is4xxClientError())) {
                return response.bodyToMono(String.class)
                        .flatMap(errorBody -> {
                            logger.info(provider + " ----> Error Response Body is {}", errorBody);

                            if (provider.equals(BankName.SAMAN.value()) && (errorBody.contains("توکن نامعتبر است") || errorBody.contains("InvalidTokenException"))) {
                                SamanLoginService.samanLoginExpTime = "2021-11-06T13:41:52";
                            }
                            return Mono.error(new CustomWebClientException(response.statusCode(),
                                    new ApiErrorResponse(LocalDateTime.now(), response.statusCode(), errorBody, response.rawStatusCode())));
                        });
            } else {
                return Mono.just(response);
            }
        });
    }


}
