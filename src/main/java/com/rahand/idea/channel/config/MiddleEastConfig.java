package com.rahand.idea.channel.config;

import com.rahand.idea.channel.wrapper.middleeast.dto.ClientInfo;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.validation.constraints.NotNull;
import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "middle-east")
@Setter
@Getter
@ToString
public class MiddleEastConfig {

    @NotNull
    private String baseUrl;

    @NotNull
    private List<ClientInfo> clientInfo;



}
