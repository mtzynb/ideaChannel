package com.rahand.idea.channel.wrapper.saman.deposit.balance.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author aglitchyy
 * @created 01/11/2021
 */
@ApiModel
@ToString
@Setter
@Getter
public class SamanDepositBalanceResponse {
    @ApiModelProperty
    private Long availableBalance;
    private Long balance;
    private Long blockedAmount;
    private String branchCode;
    private String creditDeposit;
    private Long creditLoanRemainAmount;
    private Long creditRateAmount;
    private Long creditRemainAmount;
    private String currency;
    private String depositNumber;
    private String depositStatus;
    private String depositTitle;
    private String expireDate;
    private Long extraAvailableBalance;
    private String group;
    private String inaugurationDate;
    private Long maximumBalance;
    private Long minimumBalance;
    private String owner;
    private String personality;
    private String signature;
    private String supportCurrency;
    private String supportDepositNumber;
    private String supportDepositStatus;
    private String supportStatus;
    private String withdrawalOption;
}
