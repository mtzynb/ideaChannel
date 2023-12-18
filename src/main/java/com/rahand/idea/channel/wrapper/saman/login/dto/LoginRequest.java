package com.rahand.idea.channel.wrapper.saman.login.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@ApiModel
@Setter
@Getter
public class LoginRequest {
    @ApiModelProperty
    @NotNull(message = "channel is mandatory")
    private String channel;
    @NotEmpty(message = "username is mandatory")
    private String username;
    @NotEmpty(message = "password is mandatory")
    private String password;
    @NotEmpty(message = "secretkey is mandatory")
    private String secretkey;
    private String correlationId;

}
