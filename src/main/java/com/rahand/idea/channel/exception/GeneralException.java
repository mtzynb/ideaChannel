package com.rahand.idea.channel.exception;

import lombok.Getter;
import lombok.Setter;

public class GeneralException extends RuntimeException {
    @Getter
    @Setter
    private String errorMessageKey;

    public GeneralException(String errorMessageKey) {
        super();
        this.errorMessageKey = errorMessageKey;
    }

}
