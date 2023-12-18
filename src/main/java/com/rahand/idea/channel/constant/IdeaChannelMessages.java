package com.rahand.idea.channel.constant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;


@Configuration
@PropertySource(value = "classpath:messages.properties", encoding = "UTF-8")
public class IdeaChannelMessages {

    @Value("${message.exception.badrequest}")
    public String BAD_REQUEST;

    @Value("${message.exception.notfound}")
    public String NOT_FOUND;

    @Value("${message.exception.servererror}")
    public String INTERNAL_SERVER_ERROR;

    @Value("${message.exception.depositnotfound}")
    public String SAMAN_DEPOSIT_NOT_FOUND;

    @Value("${message.exception.depositnotfound}")
    public String MIDDLE_EAST_DEPOSIT_NOT_FOUND;

    @Value("${message.exception.fromdate.larger.todate}")
    public String FROMDATE_LARGER_TODATE;

    @Value("${message.exception.fromdate.larger.today}")
    public String FROMDATE_LARGER_TODAY;

    @Value("${message.exception.todate.larger.today}")
    public String TODATE_LARGER_TODAY;

    @Autowired
    private Environment env;

    public String getProperty(String pPropertyKey) {
        return env.getProperty(pPropertyKey);
    }

}
