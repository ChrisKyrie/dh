package com.dh.common.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.messaging.rsocket.annotation.ConnectMapping;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/**
 * @ClassName utils
 * @Description TODO
 * @Author
 * @Date 2024/3/23 14:00
 * @Version 1.0
 */
@Component
public class I18nUtils {

    @Value("${spring.messages.basename}")
    private String basename;

    private static String realBaseName;

    @PostConstruct
    public void setUp() {
        realBaseName = basename;
    }

    public static String getMessage(String code, Locale locale) {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setDefaultEncoding(StandardCharsets.UTF_8.name());
        messageSource.setBasename(realBaseName);
        return messageSource.getMessage(code, null, locale);
    }
}
