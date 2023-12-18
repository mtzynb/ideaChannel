package com.rahand.idea.channel.wrapper.tourism.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class TourismStatements {

    private Long DeptorAmount;
    private Long CreditorAmount;
    private Long amount;
    private String transactionDate;
    private String Description;
    private String BranchName;
    private String BranchCode;
    private String TransactionCode; // کد تراکنش
    private String PaymentId; // شماره قبض
    private String DocNumber; // شماره سند
    private String ChqNumber; // شماره چک

}
