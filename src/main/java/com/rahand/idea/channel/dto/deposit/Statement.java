package com.rahand.idea.channel.dto.deposit;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ApiModel
@ToString
@Getter
@Setter
public class Statement {
    @JsonIgnore
    private Long dateTime;
    @ApiModelProperty
    private String agent_branch_code;
    private String agent_branch_name;
    private Long balance;
    private String branch_code;
    private String branch_name;
    private String transaction_date;
    private String description;
    private String reference_number;
    private Integer serial; // شماره سریال صورت حساب
    private String serial_number; //// مقدار این فیلد یا شماره برگه فیش واریزی ثبت شده و یا شماره برگه چک وصول شده ثبت شده در سیستم است
    private Long transfer_amount;

}