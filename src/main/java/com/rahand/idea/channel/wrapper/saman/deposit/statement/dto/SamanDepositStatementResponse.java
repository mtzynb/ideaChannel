package com.rahand.idea.channel.wrapper.saman.deposit.statement.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author aglitchyy
 * @created 02/11/2021
 */
@ApiModel
@ToString
@Setter
@Getter
public class SamanDepositStatementResponse {
    @ApiModelProperty
    private List<Statement> statements;
    private Integer totalRecord;
}
