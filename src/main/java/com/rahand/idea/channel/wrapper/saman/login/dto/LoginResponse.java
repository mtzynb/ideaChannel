package com.rahand.idea.channel.wrapper.saman.login.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

/**
 * @author aglitchyy
 * @created 01/11/2021
 */
@ApiModel
@ToString
@Getter
@Setter
public class LoginResponse {

    @ApiModelProperty
    private String currentLogin;
    private String name;
    private String gender;
    private String token;
    private String expiration;
    private String lastLogin;
    private Integer httpStatus;
    private String error;
    private String errorCode;
    private String exception;
    private ArrayList<FieldErrorResource> fieldErrors;
    private String message;
    private String path;
    private String timestamp;

}
