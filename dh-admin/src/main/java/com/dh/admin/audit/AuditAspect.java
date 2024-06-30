package com.dh.admin.audit;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;

/**
 * @ClassName AuditAspect
 * @Description TODO
 * @Author
 * @Date 2024/6/30 10:59
 * @Version 1.0
 */
@Aspect
@Component
@Slf4j
public class AuditAspect {

    @Autowired
    private AuditService auditService;

    @Pointcut("@annotation(com.dh.admin.audit.Audit)")
    public void auditPointcut() {
    }

    @Around(value = "auditPointcut()")
    public void doAround(ProceedingJoinPoint point) {
        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = (HttpServletRequest) requestAttributes.resolveReference(RequestAttributes.REFERENCE_REQUEST);
        Audit auditAnnotation = method.getAnnotation(Audit.class);
        AuditLogEntity auditLog = AuditLogEntity.builder().build();
        if (null != auditAnnotation) {
            auditLog.setDescription(auditAnnotation.description());
            auditLog.setOperationType(auditAnnotation.operationType());
            auditLog.setUrl(getUri(request));
            auditLog.setBrowser(getBrowser(request));
            auditLog.setMethod(method.getName());
        }
        try {
            point.proceed();
        } catch (Throwable e) {
            // TODO 处理接口调用失败后的审计相关逻辑
            throw new RuntimeException(e);
        }
        if(null != auditAnnotation) {
            auditService.saveAuditLog(auditLog);
        }
    }

    private String getBrowser(HttpServletRequest request) {
        String userAgent = request.getHeader("User-Agent");
        if (userAgent.contains("Chrome")) {
            return "Chrome";
        } else {
            return "";
        }
    }

    private String getUri(HttpServletRequest request) {
        return request.getRequestURI();
    }
}
