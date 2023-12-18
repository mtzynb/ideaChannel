package com.rahand.idea.channel.exception;

import com.rahand.idea.channel.constant.IdeaChannelMessages;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
import java.util.HashSet;

@Component
@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @Autowired
    IdeaChannelMessages ideaChannelMessages;
    Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        logger.error(ex.getMessage());
        HashSet<String> errors = new HashSet<>();
        for (FieldError error : ex.getBindingResult().getFieldErrors()) {
            errors.add(error.getField() + ": " + error.getDefaultMessage());
        }
        for (ObjectError error : ex.getBindingResult().getGlobalErrors()) {
            errors.add(error.getObjectName() + ": " + error.getDefaultMessage());
        }
        ApiErrorResponse apiError =
                new ApiErrorResponse(LocalDateTime.now(), HttpStatus.BAD_REQUEST, ideaChannelMessages.BAD_REQUEST, errors, HttpStatus.BAD_REQUEST.value());
        return new ResponseEntity<Object>(
                apiError, new HttpHeaders(), HttpStatus.resolve(apiError.getCode()));
    }

    @ExceptionHandler({Exception.class})
    public ResponseEntity<Object> handleAll(Exception ex, WebRequest request) {
        logger.error(ex.getMessage());
        HashSet<String> errors = new HashSet<>();
        ApiErrorResponse apiError;
        if (ex instanceof GeneralException) {
            apiError = new ApiErrorResponse(LocalDateTime.now()
                    , HttpStatus.BAD_REQUEST, ideaChannelMessages.getProperty(((GeneralException) ex).getErrorMessageKey()), errors, HttpStatus.BAD_REQUEST.value());
        }
        if (ex instanceof CustomWebClientException) {
            apiError = new ApiErrorResponse(LocalDateTime.now()
                    , ((CustomWebClientException) ex).getStatus(), ex.getMessage(), errors, ((CustomWebClientException) ex).getStatus().value());
        } else {
            apiError = new ApiErrorResponse(LocalDateTime.now()
                    , HttpStatus.INTERNAL_SERVER_ERROR, ex.getMessage(), errors, HttpStatus.INTERNAL_SERVER_ERROR.value());
        }
        return new ResponseEntity<Object>(
                apiError, new HttpHeaders(), apiError.getStatus());
    }

    @Override
    protected ResponseEntity<Object> handleNoHandlerFoundException(
            NoHandlerFoundException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        logger.error(ex.getMessage());
        HashSet<String> errors = new HashSet<>();
        ApiErrorResponse apiError = new ApiErrorResponse(LocalDateTime.now(), HttpStatus.NOT_FOUND, ideaChannelMessages.NOT_FOUND, errors, HttpStatus.NOT_FOUND.value());

        return new ResponseEntity<Object>(apiError, new HttpHeaders(), apiError.getStatus());
    }
}
