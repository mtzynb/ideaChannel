package com.rahand.idea.channel.wrapper.tourism.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ToString
@Setter
@Getter
public class TourismDepositStatementsData {

    @JsonProperty("DeptorAmount")
    private Long deptorAmount;
    @JsonProperty("CreditorAmount")
    private Long creditorAmount;
    @JsonProperty("Amount")
    private Long amount; // موجودی
    @JsonProperty("TransactionDate")
    private String transactionDate;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("BranchName")
    private String branchName;
    @JsonProperty("BranchCode")
    private String branchCode;
    @JsonProperty("TransactionCode")
    private String transactionCode; // کد تراکنش
    @JsonProperty("PaymentId")
    private String paymentId; // شماره قبض
    @JsonProperty("DocNumber")
    private String docNumber; // شماره سند
    @JsonProperty("ChqNumber") // شماره چک
    private String chqNumber;
    @JsonProperty("TransactionSideLastName")
    private String transactionSideLastName;
    @JsonProperty("TransactionSideFirstName")
    private String transactionSideFirstName;
    @JsonProperty("TransactionSideDestDepositNum")
    private String transactionSideDestDepositNum;
    @JsonProperty("TransactionSideSrcDepositNum")
    private String transactionSideSrcDepositNum;
}
