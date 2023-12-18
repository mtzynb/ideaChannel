package com.rahand.idea.channel.config;

import com.rahand.idea.channel.wrapper.faraboom.dto.InternetBankInfo;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.validation.constraints.NotNull;

@Configuration
@ConfigurationProperties(prefix = "faraboom")
@Setter
@Getter
@ToString
public class FaraBoomConfig {

    @NotNull
    private String apiBaseUrl;

    @NotNull
    private String oauthBaseUrl;

    @NotNull
    private String username;

    @NotNull
    private String password;

    @NotNull
    private String tokenId;

    @NotNull
    private String appKey;

    @NotNull
    private String appSecret;

    @NotNull
    private String bankName;

    @NotNull
    private InternetBankInfo internetBankInfo;

}
