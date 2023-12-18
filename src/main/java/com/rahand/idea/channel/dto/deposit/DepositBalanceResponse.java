package com.rahand.idea.channel.dto.deposit;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ApiModel
@ToString
@Getter
@Setter
public final class DepositBalanceResponse {
    @ApiModelProperty
    private String operation_time;
    private String deposit_number;
    private Long balance;
    private Long blocked_amount;
    private Long available_balance;
    private Long extra_available_balance;
    private String currency;
    private String branchCode;
}

