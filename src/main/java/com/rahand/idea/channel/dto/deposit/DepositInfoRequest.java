package com.rahand.idea.channel.dto.deposit;

import com.rahand.idea.channel.enums.BankName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@ApiModel
@Setter
@Getter
public class DepositInfoRequest {
    @ApiModelProperty
    @NotNull(message = "نام بانک الزامی می باشد")
    private BankName bankName;
    @NotEmpty(message = "شماره حساب الزامی می باشد")
    private String deposit_number;
    @NotEmpty(message = "شماره مشتری الزامی می باشد")
    private String customer_number;


}
