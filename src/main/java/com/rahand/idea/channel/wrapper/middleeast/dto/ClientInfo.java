package com.rahand.idea.channel.wrapper.middleeast.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;

@Setter
@Getter
@ToString
public class ClientInfo {

    @NotNull
    private String cif;
    @NotNull
    private String clientName;
    @NotNull
    private String apiKey ;
}
