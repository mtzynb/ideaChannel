package com.rahand.idea.channel.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
public class ApiErrorResponse {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private LocalDateTime timestamp;
    private HttpStatus status;
    private String message;
    private Set errors;
    private int code;

    public ApiErrorResponse(LocalDateTime timestamp, HttpStatus status, String message, int code) {
        this.timestamp = timestamp;
        this.status = status;
        this.message = message;
        this.code = code;
    }

    public ApiErrorResponse(LocalDateTime timestamp, HttpStatus status, String message, Set errors, int code) {
        this.timestamp = timestamp;
        this.status = status;
        this.message = message;
        this.errors = errors;
        this.code = code;
    }
}