package com.dh.admin.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @ClassName DhApplicationRunner
 * @Description application启动之后的初始化功能
 * @Author
 * @Date 2024/2/24 14:27
 * @Version 1.0
 */
@Component
@Slf4j
public class DhApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("This is application runner");
    }
}
