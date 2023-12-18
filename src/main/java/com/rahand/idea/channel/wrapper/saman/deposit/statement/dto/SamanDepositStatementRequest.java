package com.rahand.idea.channel.wrapper.saman.deposit.statement.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;

/**
 * @author aglitchyy
 * @created 02/11/2021
 */
@ApiModel
@ToString
@Setter
@Getter
public class SamanDepositStatementRequest {
    @ApiModelProperty
    @NotEmpty(message = "token is mandatory")
    private String token;

    @NotEmpty(message = "channel is mandatory")
    private String channel;

    @NotEmpty(message = "depositNumber is mandatory")
    private String depositNumber;

    @NotEmpty(message = "fromDate is mandatory")
    private String fromDate;

    @NotEmpty(message = "toDate is mandatory")
    private String toDate;

    private Integer length;
    private Integer offset;
    private String action; //[CREDIT, DEBIT]
    private String clientIp;
    private String englishDescription; //[PER, EN]
    private String cif;
    private String description;
    private String order; //[DESC, ASC]
}
