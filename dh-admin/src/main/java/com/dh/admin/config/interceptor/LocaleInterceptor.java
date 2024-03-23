package com.dh.admin.config.interceptor;

import com.dh.common.context.LocaleContext;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @ClassName LocalInterceptor
 * @Description 国际化拦截器
 * @Author
 * @Date 2024/3/23 13:33
 * @Version 1.0
 */
@Component
@Slf4j
public class LocaleInterceptor implements HandlerInterceptor {

    private static final String LOCALE_KEY = "Lang";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String language = request.getHeader(LOCALE_KEY);
        log.debug("language is [{}]", language);
        Locale locale = Locale.getDefault();
        if (StringUtils.isNotEmpty(language)) {
            String[] split = language.split("-");
            locale = new Locale(split[0], split[1]);
        }
        LocaleContext.set(locale);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        LocaleContext.remove();
    }
}
