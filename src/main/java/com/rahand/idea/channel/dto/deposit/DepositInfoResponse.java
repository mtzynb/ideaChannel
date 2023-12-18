package com.rahand.idea.channel.dto.deposit;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@ApiModel
@Getter
@Setter
public final class DepositInfoResponse {
    @ApiModelProperty
    public long operation_time;
    public String deposit_number;
    public String deposit_status;
    public Date inauguration_date;
    public Date expire_date;
    public long balance;
    public int blocked_amount;
    public String currency;
    public String personality;
    public String owner;
    public String signature;
    public String deposit_title;
    public String branch_code;
    public String group;
    public String support_deposit_status;
    public String withdrawal_option;
    public long available_balance;
    public long extra_available_balance;
    public String iban;
    public long maximum_balance;
    public int minimum_balance;
}
