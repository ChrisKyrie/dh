package com.dh.common.api;

import java.util.Locale;

public interface IErrorCode {
    /**
     * 返回码
     */
    long getCode();

    /**
     * 返回信息
     */

    String getMessage();

    String getMessage(Locale locale);
}
