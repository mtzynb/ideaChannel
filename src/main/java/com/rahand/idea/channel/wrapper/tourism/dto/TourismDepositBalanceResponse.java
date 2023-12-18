package com.rahand.idea.channel.wrapper.tourism.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rahand.idea.channel.exception.ApiErrorResponse;
import com.rahand.idea.channel.exception.CustomWebClientException;
import com.rahand.idea.channel.util.LogUtils;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.Map;

@ToString
@Setter
@Getter
public class TourismDepositBalanceResponse {

    @JsonProperty("IsSuccess")
    private boolean IsSuccess;
    @JsonProperty("Data")
    private Map<String, Object> dataMap;
    @JsonIgnore
    private TourismDepositBalanceData data;
    @JsonProperty("Message")
    private String message;
    @JsonProperty("MessageCode")
    private int messageCode;
    @JsonProperty("ErrorCode")
    private int errorCode;

    public TourismDepositBalanceData getData() {

        ObjectMapper mapper = new ObjectMapper();
        try {
            data = mapper.readValue(mapper.writeValueAsString(dataMap), TourismDepositBalanceData.class);
        } catch (JsonMappingException e) {
            LogUtils.getLogger().error("Error in Tourism DTO Mapper Service : " + e.getMessage());
            throw new CustomWebClientException(HttpStatus.INTERNAL_SERVER_ERROR,
                    new ApiErrorResponse(LocalDateTime.now(), HttpStatus.INTERNAL_SERVER_ERROR, "INTERNAL SERVER ERROR : " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value()));
        } catch (JsonProcessingException e) {
            LogUtils.getLogger().error("Error in Tourism DTO Mapper Service : " + e.getMessage());
            throw new CustomWebClientException(HttpStatus.INTERNAL_SERVER_ERROR,
                    new ApiErrorResponse(LocalDateTime.now(), HttpStatus.INTERNAL_SERVER_ERROR, "INTERNAL SERVER ERROR : " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value()));
        }
        return data;
    }
}
