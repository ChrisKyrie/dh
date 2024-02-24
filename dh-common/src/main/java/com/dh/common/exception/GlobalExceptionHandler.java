package com.dh.common.exception;

import com.dh.common.api.CommonResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(value = ApiException.class)
    public CommonResult handleApiException(ApiException ex) {
        if (ex.getErrorCode() != null) {
            CommonResult.failed(ex.getErrorCode());
        }
        return CommonResult.failed(ex.getMessage());
    }

}
