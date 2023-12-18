package com.rahand.idea.channel.wrapper.saman.login.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author aglitchyy
 * @created 01/11/2021
 */

@ApiModel
@Getter
@Setter
public class FieldErrorResource {

    @ApiModelProperty
    private String code;
    private String field;
    private String message;
    private Object rejectedValue;

}
