package com.rahand.idea.channel.wrapper.faraboom.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;

@ToString
@Setter
@Getter
public class InternetBankInfo {

    @NotNull
    private String username;
    @NotNull
    private String password;

    private String mobileNumber;
    private String nationalCode;
    private String customerNumber;
}
