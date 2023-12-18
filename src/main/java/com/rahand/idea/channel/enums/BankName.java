package com.rahand.idea.channel.enums;

import io.swagger.annotations.ApiModel;

@ApiModel
public enum BankName {

    FARABOOM_BOOMIR,        // بانک محیط تستی بوم
    FARABOOM_CIYBIR,        // بانک شهر
    FARABOOM_HEKMIR,        // بانک حکمت ایرانیان
    FARABOOM_DAYBIR,        // بانک دی
    FARABOOM_SINAIR,        // بانک سینا
    FARABOOM_SRMBIR,        // بانک سرمایه
    FARABOOM_IVBBIR,        // بانک ایران ونزوئلا
    FARABOOM_IRZAIR,        // بانک ایران زمین
    FARABOOM_MEHRIR,        // بانک مهر ایران
    FARABOOM_MEDBIR,        // بانک مهر اقتصاد
    FARABOOM_PBIRIR,        // پست بانک ایران
    FARABOOM_BOIMIR,        // بانک صنعت و معدن
    FARABOOM_MELIIR,        // بانک ملی ایران
    FARABOOM_BTOSIR,        // موسسه توسعه
    FARABOOM_BKBPIR,        // بانک پاسارگاد
    FARABOOM_SEPBIR,        // بانک سپه
    FARABOOM_AYBKIR,        // بانک آینده
    FARABOOM_BKMTIR,        // بانک ملت
    FARABOOM_BTEJIR,        // بانک تجارت
    FARABOOM_BKPAIR,        // بانک پارسیان
    FARABOOM_KESHIR,        // بانک کشاورزی
    FARABOOM_BKMNIR,        // بانک مسکن
    FARABOOM_KHMIIR,        // بانک خاورمیانه
    FARABOOM_BEGNIR,        // بانک اقتصاد نوین
    FARABOOM_SABCIR,        // بانک سامان
    SAMAN,
    MIDDLE_EAST,
    TOURISM;

    public String value() {
        return name();
    }
}
