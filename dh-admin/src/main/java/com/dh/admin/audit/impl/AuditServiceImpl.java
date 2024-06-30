package com.dh.admin.audit.impl;

import com.dh.admin.audit.AuditLogEntity;
import com.dh.admin.audit.AuditService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @ClassName AuditServiceImpl
 * @Description TODO
 * @Author
 * @Date 2024/6/30 11:19
 * @Version 1.0
 */
@Service
@Slf4j
public class AuditServiceImpl implements AuditService {
    @Override
    public void saveAuditLog(AuditLogEntity auditLog) {
        log.info("save audit log {}", auditLog);
    }
}
