package com.dh.common.api;

import com.dh.common.context.LocaleContext;
import com.dh.common.utils.I18nUtils;

import java.util.Locale;

public enum ResultCode implements IErrorCode {
    SUCCESS(200, "操作成功"),
    FAILED(500, "操作失败"),
    VALIDATE_FAILED(404, "参数检验失败"),
    UNAUTHORIZED(401, "暂未登录或token已经过期"),
    FORBIDDEN(403, "没有相关权限");
    private long code;
    private String message;

    private ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public long getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        Locale locale = LocaleContext.get();
        if (locale == null) {
            locale = Locale.getDefault();
        }
        return getMessage(locale);
    }


    @Override
    public String getMessage(Locale locale) {
        return I18nUtils.getMessage(String.valueOf(code), locale);
    }
}
