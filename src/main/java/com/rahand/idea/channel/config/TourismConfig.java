package com.rahand.idea.channel.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.validation.constraints.NotNull;

@Configuration
@ConfigurationProperties(prefix = "tourism")
@Setter
@Getter
@ToString
public class TourismConfig {

    @NotNull
    private String serviceUrl;
    @NotNull
    private String userName;
    @NotNull
    private String privateKey;
}
