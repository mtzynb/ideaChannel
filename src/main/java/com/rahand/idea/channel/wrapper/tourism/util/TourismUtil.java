package com.rahand.idea.channel.wrapper.tourism.util;


import com.rahand.idea.channel.util.date.CalendarUtil;
import com.rahand.idea.channel.util.date.DateTime;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

@Component
public class TourismUtil {


    public static boolean isServerError(int errorCode) {

        boolean isServerError = false;

        LinkedList<Integer> errorsCode = new LinkedList<>();
        errorsCode.add(4000);
        errorsCode.add(2);
        errorsCode.add(6);
        errorsCode.add(1005);
        errorsCode.add(3000);
        errorsCode.add(3002);
        errorsCode.add(3006);
        errorsCode.add(3007);
        errorsCode.add(3008);
        errorsCode.add(3013);
        errorsCode.add(3049);
        errorsCode.add(5000);
        errorsCode.add(9005);
        errorsCode.add(9006);

        if (errorsCode.contains(errorCode)) {
            isServerError = true;
        }

        return isServerError;
    }

    public static String persianDateToGregorianDate(String persianDateTime) {

        String[] persianDateTimeArray = persianDateTime.split("[-,.]");
        String[] persianDateArray = persianDateTimeArray[0].trim().split("/");
        String[] timeArray = persianDateTimeArray[1].trim().split(":");

        int year = Integer.parseInt(persianDateArray[0]);
        int month = Integer.parseInt(persianDateArray[1]);
        int day = Integer.parseInt(persianDateArray[2]);
        int hour = Integer.parseInt(timeArray[0]);
        int minute = Integer.parseInt(timeArray[1]);
        int second = Integer.parseInt(timeArray[2]);
        int millisecond = Integer.parseInt(persianDateTimeArray[2].trim());

        DateTime dateTime = new DateTime(year, month, day, hour, minute, second, millisecond);
        Date date = CalendarUtil.jalaliToGregorianDate(dateTime);
        String gregorianDateTime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").format(date);

        return gregorianDateTime;
    }


}
