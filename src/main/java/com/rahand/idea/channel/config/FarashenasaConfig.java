package com.rahand.idea.channel.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.validation.constraints.NotNull;


@Configuration
@ConfigurationProperties(prefix = "farashenasa")
@Setter
@Getter
@ToString
public class FarashenasaConfig {

    @NotNull
    private String baseUrl;

}
