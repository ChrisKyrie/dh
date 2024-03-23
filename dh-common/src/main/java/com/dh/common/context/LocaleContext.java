package com.dh.common.context;

import java.util.Locale;

/**
 * @ClassName LocaleContext
 * @Description TODO
 * @Author
 * @Date 2024/3/23 13:37
 * @Version 1.0
 */
public class LocaleContext {

    private static final ThreadLocal<Locale> localeContext = new ThreadLocal<>();

    public static void set(Locale locale){
        localeContext.set(locale);
    }

    public static Locale get(){
        return localeContext.get();
    }

    public static void remove(){
        localeContext.remove();
    }
}
