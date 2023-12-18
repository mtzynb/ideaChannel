package com.rahand.idea.channel.wrapper.tourism.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.LinkedHashMap;
import java.util.List;

@Setter
@Getter
@ToString
public class TourismDepositBalanceData {

    @JsonProperty("Amounts")
    private List<LinkedHashMap<String, String>> amounts;
    @JsonProperty("WithdrawableAmounts")
    private List<LinkedHashMap<String, String>> withDrawableAmounts;
    @JsonProperty("DepositNumber")
    private String depositNumber;

    @JsonIgnore
    private Long amount;
    @JsonIgnore
    private Long availableAmount;
    @JsonIgnore
    private Long blockedAmount;
    @JsonIgnore
    private String currency;

    public void initDepositBalanceData() {

        this.amount = Long.valueOf(amounts.get(0).get("Amount"));
        this.availableAmount = Long.valueOf(withDrawableAmounts.get(0).get("Amount"));
        this.blockedAmount = amount - availableAmount;
        this.currency = String.valueOf(amounts.get(0).get("CurrencySwiftCode"));

    }


}
