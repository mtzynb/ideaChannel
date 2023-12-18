package com.rahand.idea.channel.dto.farashenasa.video;

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
public class VideoRequest {
    @ApiModelProperty(required = true)
    @NotNull(message = "شناسه یکتا (uniqueKey) الزامی است.")
    private String uniqueKey;

    @ApiModelProperty(required = true, example = "testVideo")
    @NotNull(message = "فیلد type الزامی است.")
    private String type;

    @ApiModelProperty(required = true, example = "speaking | gesture")
    @NotNull(message = "فیلد mode الزامی است.")
    private String mode;

    @ApiModelProperty(required = true)
    @NotNull(message = "آپلود فیلم الزامی است.")
    private MultipartFile testVideo;
}
