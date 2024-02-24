package com.dh.admin.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @ClassName MyTask
 * @Description TODO
 * @Author
 * @Date 2024/2/24 14:55
 * @Version 1.0
 */
@Component
@Slf4j
public class MyTask {

    @Scheduled(fixedDelay = 1000L)
    private void schedulerTask(){
        System.out.println("This is scheduler task");
    }
}
