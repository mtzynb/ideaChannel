package com.rahand.idea.channel.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.validation.constraints.NotNull;


@Configuration
@ConfigurationProperties(prefix = "saman")
@Setter
@Getter
@ToString
public class SamanConfig {

    @NotNull
    private String baseUrl;

    @NotNull
    private String username;

    @NotNull
    private String password;

    @NotNull
    private String channel;

    @NotNull
    private String loginPort;

    @NotNull
    private String depositBalancePort;

    @NotNull
    private String depositStatementPort;

    @NotNull
    private String secretKey;

}
