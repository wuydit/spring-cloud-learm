package org.wuyd.scheduled.job;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;

/**
 * @author wuyd
 * @version 1.0
 * @description TODO
 * @time 2019/4/10 10:18
 */
@EnableAsync
@Configuration
@EnableScheduling
public class SaticScheduleTask {

    @Async
    @Scheduled(cron = "0/3 * * * * ?")
    public void configureTasks()throws Exception {
        System.err.println(Thread.currentThread().getName() + "执行静态定时任务时间: " + LocalDateTime.now());
        Thread.sleep(5000);
    }
}
