package com.rahand.idea.channel.dto.deposit;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@ApiModel
@ToString
@Getter
@Setter
public final class DepositStatementsResponse {
    @ApiModelProperty
    private String operation_time;
    private List<Statement> statements;
    private Integer total_record;
}
