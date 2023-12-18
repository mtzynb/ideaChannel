package com.rahand.idea.channel.wrapper.tourism.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@ToString
@Setter
@Getter
public class TourismStatementsResponse {

    @JsonProperty("IsSuccess")
    private boolean IsSuccess;
    @JsonProperty("Data")
    private List dataList;
    @JsonIgnore
    private List<TourismDepositStatementsData> data;
    @JsonProperty("Message")
    private String message;
    @JsonProperty("MessageCode")
    private int messageCode;
    @JsonProperty("ErrorCode")
    private int errorCode;

    public List<TourismDepositStatementsData> getData() {

        ObjectMapper mapper = new ObjectMapper();
        try {
            data =  mapper.readValue(mapper.writeValueAsString(dataList), List.class);
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return data;
    }
}
