package com.rahand.idea.channel.util.date;

import com.rahand.idea.channel.exception.GeneralException;
import com.rahand.idea.channel.util.LogUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateUtils {

    public static String getSysDateInStr(String pattern) {
        DateFormat date = new SimpleDateFormat(pattern);
        return date.format(getSysDateInDate());
    }

    public static Calendar getSysDateInCal() {
        return Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.getDefault());
    }

    public static Date getSysDateInDate() {
        return getSysDateInCal().getTime();
    }

    public static Date getDateFromStr(String date, String pattern) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat(pattern, Locale.getDefault());
            return dateFormat.parse(date);
        } catch (ParseException e) {
            LogUtils.getLogger().error(e.getMessage());
            throw new GeneralException(e.getMessage());
        }
    }

    public static String timestampToDate(Long date) {

        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").format(date);
    }

    public static void checkTimeInterval(String fromDate, String toDate) {

        Calendar fromDateCal = toCalendar(DateUtils.getDateFromStr(fromDate, "yyyy-MM-dd'T'HH:mm:ss"));
        Calendar toDateCal = toCalendar(DateUtils.getDateFromStr(toDate, "yyyy-MM-dd'T'HH:mm:ss"));

        if (fromDateCal.after(Calendar.getInstance())) {
            throw new GeneralException("FROMDATE_LARGER_TODAY");
        }
        if (toDateCal.after(Calendar.getInstance())) {
            throw new GeneralException("TODATE_LARGER_TODAY");
        }
        if (fromDateCal.after(toDateCal)) {
            throw new GeneralException("FROMDATE_LARGER_TODATE");
        }
    }

    public static Calendar toCalendar(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal;
    }
}