package com.rahand.idea.channel.wrapper.saman.deposit.statement.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author aglitchyy
 * @created 02/11/2021
 */

@ApiModel
@ToString
@Setter
@Getter
public class Statement {
    @ApiModelProperty
    private String agentBranchCode; //کد شعبه عامل
    private String agentBranchName; // نام شعبه عامل
    private Long balance; // موجودی
    private String branchCode;
    private String branchName;
    private String date; // تاریخ صورتحساب
    private String description;
    private String referenceNumber; // شماره ارجاع
    private String registrationNumber; // این فیلد منسوخ شده است. جایگزین آن فیلد serialNumber می باشد.) مقدار این فیلد یا شماره برگه فیش واریزی ثبت شده و یا شماره برگه چک وصول شده ثبت شده در سیستم است)
    private Integer serial; // شماره سریال صورت حساب
    private String serialNumber; // مقدار این فیلد یا شماره برگه فیش واریزی ثبت شده و یا شماره برگه چک وصول شده ثبت شده در سیستم است
    private Long transferAmount; // مبلغ انتقال وجه
}
