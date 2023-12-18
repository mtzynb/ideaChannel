package com.rahand.idea.channel.dto.farashenasa.token;

import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author aglitchyy
 * @created 21/02/2022
 */

@ApiModel
@ToString
@Getter
@Setter
public class TokenRequest {
    private String uniqueKey;
}
