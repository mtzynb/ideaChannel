package com.rahand.idea.channel.wrapper.faraboom.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.http.MediaType;

@ToString
@Setter
@Getter
@Builder
public class BoomHeader {

    private String authorization;
    private String appKey;
    private String tokenId;
    private String bankId;
    private String acceptLanguage;
    private String contentType;
    private String accept;
    private String deviceId;
    private String clientIpAddress;
    private String clientPlatformType;
    private String clientDeviceId;
    private String clientUserAgent;
    private String clientUserId;

}
