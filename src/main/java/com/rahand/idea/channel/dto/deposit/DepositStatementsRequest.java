package com.rahand.idea.channel.dto.deposit;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.rahand.idea.channel.enums.BankName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@ApiModel
@ToString
@Setter
@Getter
public class DepositStatementsRequest {
    @ApiModelProperty(required = true)
    @NotNull(message = "نام بانک الزامی می باشد")
    private BankName bankName;

    @ApiModelProperty(required = true)
    @NotEmpty(message = "شماره حساب الزامی می باشد")
    private String deposit_number;

    @ApiModelProperty(required = true, example = "2020-10-31T09:55:01")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @NotEmpty(message = "from_date الزامی می باشد")
    private String from_date;

    @ApiModelProperty(required = true, example = "2021-10-31T09:55:01")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @NotEmpty(message = "to_date الزامی می باشد")
    private String to_date;

    private String customer_number;
    private Integer offset;
    private Integer length;
    private OrderType order;
    private String description;
    private ActionType action;
}
