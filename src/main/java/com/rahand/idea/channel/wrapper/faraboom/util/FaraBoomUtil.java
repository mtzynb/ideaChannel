package com.rahand.idea.channel.wrapper.faraboom.util;

import com.rahand.idea.channel.wrapper.faraboom.dto.BoomHeader;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

@Component
public class FaraBoomUtil {

    public static MultiValueMap<String, String> setBankingHeaders(BoomHeader boomHeader) {

        MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();

        headers.add("Authorization", String.format("Bearer %s", boomHeader.getAuthorization()));
        headers.add("App-Key", boomHeader.getAppKey());
        headers.add("Token-Id", boomHeader.getTokenId());
        headers.add("Bank-Id", boomHeader.getBankId());
        headers.add("Accept-Language", boomHeader.getAcceptLanguage());
        headers.add("CONTENT-TYPE", boomHeader.getContentType());
        headers.add("ACCEPT", boomHeader.getAccept());
        headers.add("Device-Id", boomHeader.getDeviceId());
        headers.add("CLIENT-IP-ADDRESS", boomHeader.getClientIpAddress());
        headers.add("CLIENT-PLATFORM-TYPE", boomHeader.getClientPlatformType());
        headers.add("CLIENT-DEVICE-ID", boomHeader.getClientDeviceId());
        headers.add("CLIENT-USER-AGENT", boomHeader.getClientUserAgent());
        headers.add("CLIENT-USER-ID", boomHeader.getClientUserId());

        return headers;
    }
}
