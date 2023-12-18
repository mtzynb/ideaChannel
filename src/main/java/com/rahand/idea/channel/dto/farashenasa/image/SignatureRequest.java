package com.rahand.idea.channel.dto.farashenasa.image;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotNull;

/**
 * @author aglitchyy
 * @created 21/02/2022
 */
@ApiModel
@ToString
@Getter
@Setter
public class SignatureRequest {

    @ApiModelProperty(required = true)
    @NotNull(message = "شناسه یکتا (uniqueKey) الزامی است.")
    private String uniqueKey;

    @ApiModelProperty(required = true, example = "signature")
    @NotNull(message = "فیلد type الزامی است.")
    private String type;

    @ApiModelProperty(required = true, example = "paint | photo")
    @NotNull(message = "فیلد signType الزامی است.")
    private String signType;

    @ApiModelProperty(required = true)
    @NotNull(message = "آپلود عکس سلفی الزامی است.")
    private MultipartFile signature;
}
