package com.dh.admin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @ClassName AsyncTaskExecutorConfig
 * @Description 异步执行任务线程池配置
 * @Author
 * @Date 2024/2/24 15:48
 * @Version 1.0
 */
@Configuration
public class AsyncTaskExecutorConfig {
    public static final String EXECUTOR_SERVICE = "asyncTaskExecutor";

    private static final int CORE_THREAD_SIZE = 1;
    private static final int MAX_THREAD_SIZE = 1;
    private static final int QUEUE_CAPACITY = 10;

    @Bean(EXECUTOR_SERVICE)
    public TaskExecutor taskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(CORE_THREAD_SIZE);
        executor.setMaxPoolSize(MAX_THREAD_SIZE);
        executor.setQueueCapacity(QUEUE_CAPACITY);
        executor.setKeepAliveSeconds(10);
        executor.setThreadNamePrefix("async-task-");
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        executor.setWaitForTasksToCompleteOnShutdown(true);
        return executor;
    }
}
