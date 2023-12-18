package com.rahand.idea.channel.wrapper.faraboom.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class CostumerDto {

    @JsonProperty("name")
    private String name;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("cif")
    private String cif;
    @JsonProperty("number")
    private String number;
    @JsonProperty("national_code")
    private String nationalCode;
}
