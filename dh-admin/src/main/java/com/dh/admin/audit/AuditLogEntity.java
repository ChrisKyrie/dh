package com.dh.admin.audit;

import lombok.Builder;
import lombok.Data;

/**
 * @ClassName AuditLogEntity
 * @Description TODO
 * @Author
 * @Date 2024/6/30 11:04
 * @Version 1.0
 */
@Data
@Builder
public class AuditLogEntity {
    /**
     * 审计事件描述
     */
    private String description;

    /**
     * 审计事件类型
     */
    private String operationType;

    /**
     * 请求url
     */
    private String url;

    /**
     * 客户端浏览器类型
     */
    private String browser;

    /**
     * 接口方法名
     */
    private String method;
}
