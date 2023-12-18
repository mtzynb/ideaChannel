package com.rahand.idea.channel.exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.web.reactive.function.client.WebClientException;

@Getter
@Setter
public class CustomWebClientException extends WebClientException {

    private final HttpStatus status;
    private final ApiErrorResponse apiErrorResponse;

    public CustomWebClientException(HttpStatus status, ApiErrorResponse apiErrorResponse) {
        super(apiErrorResponse.getMessage(), null);
        this.status = status;
        this.apiErrorResponse = apiErrorResponse;
    }

}
