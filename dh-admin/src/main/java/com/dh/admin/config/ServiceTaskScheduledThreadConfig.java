package com.dh.admin.config;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 * @ClassName ServiceTaskScheduledThreadConfig
 * @Description TODO
 * @Author
 * @Date 2024/2/24 14:49
 * @Version 1.0
 */
@Configuration
public class ServiceTaskScheduledThreadConfig {

    private static final int CORE_THREAD_SIZE = 1;

    @Bean
    public ScheduledThreadPoolExecutor scheduledThreadPoolExecutor() {
        return new ScheduledThreadPoolExecutor(CORE_THREAD_SIZE,
                new ThreadFactoryBuilder().setNameFormat("scheduler-task-%d").build());
    }
}
