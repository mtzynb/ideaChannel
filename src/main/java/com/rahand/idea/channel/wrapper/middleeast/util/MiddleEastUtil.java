package com.rahand.idea.channel.wrapper.middleeast.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rahand.idea.channel.exception.ApiErrorResponse;
import com.rahand.idea.channel.exception.CustomWebClientException;
import com.rahand.idea.channel.exception.GeneralException;
import com.rahand.idea.channel.util.LogUtils;
import com.rahand.idea.channel.util.date.CalendarUtil;
import com.rahand.idea.channel.util.date.DateUtils;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class MiddleEastUtil {

    public static String generateInputJson(Map inputMap) {

        String json = "";
        ObjectMapper mapper = new ObjectMapper();
        try {
            json = mapper.writeValueAsString(inputMap);
        } catch (JsonProcessingException e) {
            LogUtils.getLogger().error(e.getMessage());
            throw new GeneralException(e.getMessage());
        }
        return json;
    }

    public static String generateKey(String clientName, String serviceName, String inputMessage, String apiKey) {

        String key = "";
        String tmp = clientName + serviceName + inputMessage + apiKey;
        byte[] bytes = tmp.getBytes();
        MessageDigest hashString = null;
        try {
            hashString = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            LogUtils.getLogger().error(e.getMessage());
            throw new GeneralException(e.getMessage());
        }
        hashString.update(bytes);

        byte[] byteData = hashString.digest();
        StringBuffer hash = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
            hash.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }
        key = hash.toString().replaceAll("-", "").toLowerCase();
        return key;

    }

    public static Object jsonToObject(String json, Object object) {

        Object outputObject = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            outputObject = mapper.readValue(json, object.getClass());
        } catch (JsonProcessingException e) {
            LogUtils.getLogger().error(e.getMessage());
            throw new GeneralException(e.getMessage());
        }
        return outputObject;
    }

    public static String toPersianDate(String dateStr) {
        Date date = DateUtils.getDateFromStr(dateStr, "yyyy-MM-dd'T'HH:mm:ss");
        return CalendarUtil.gregorianToJalali(date).toString().substring(0, CalendarUtil.gregorianToJalali(date).toString().indexOf(" "));
    }

    public static void depositNumberValidation(String depositNumber){

        String[] deopistParts = depositNumber.split("/");

        String part1 = deopistParts[0];
        String part2 = deopistParts[1];
        String part3 = deopistParts[2];
        String part4 = deopistParts[3];

        if (part1.length() != 4 || part2.length() != 2  || part3.length() != 3 || part4.length() != 9){
            String errorMessage = "";
            Map<String,String> responseMap = new HashMap<>();
            responseMap.put("errorCode", "11");
            responseMap.put("title", "شماره حساب معتبر نمی باشد");

            try {
                errorMessage = new ObjectMapper().writeValueAsString(responseMap);
            } catch (JsonProcessingException e) {
                LogUtils.getLogger().error(e.getMessage());
                throw new GeneralException(e.getMessage());
            }

            throw new CustomWebClientException(HttpStatus.BAD_REQUEST,
                    new ApiErrorResponse(LocalDateTime.now(), HttpStatus.BAD_REQUEST, errorMessage, HttpStatus.BAD_REQUEST.value()));
        }
    }
}
