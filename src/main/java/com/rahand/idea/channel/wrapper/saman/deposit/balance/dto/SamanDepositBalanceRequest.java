package com.rahand.idea.channel.wrapper.saman.deposit.balance.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;

/**
 * @author aglitchyy
 * @created 01/11/2021
 */
@ApiModel
@ToString
@Setter
@Getter
public class SamanDepositBalanceRequest {
    @ApiModelProperty
    @NotEmpty(message = "depositNumber is mandatory")
    private String depositNumber;

    @NotEmpty(message = "cif is mandatory")
    private String cif;

    @NotEmpty(message = "channel is mandatory")
    private String channel;

    @NotEmpty(message = "token is mandatory")
    private String token;

    private String clientIp;
}
