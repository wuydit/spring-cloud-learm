package org.wuyd.scheduled.job;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;
import org.wuyd.scheduled.mapper.CronMapper;

import java.time.LocalDateTime;

/**
 * @author wuyd
 * @version 1.0
 * @description TODO
 * @time 2019/4/10 10:52
 */
@Configuration
@EnableScheduling
public class DynamicScheduleTask implements SchedulingConfigurer {

    private CronMapper cronMapper;

    public DynamicScheduleTask(CronMapper cronMapper) {
        this.cronMapper = cronMapper;
    }

    /**
     * 执行定时任务.
     */
    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {

        taskRegistrar.addTriggerTask(
                //1.添加任务内容(Runnable)
                () -> {
                    System.out.println( Thread.currentThread().getName() + " 执行动态定时任务: " + LocalDateTime.now().toLocalTime());
                    try{
                        Thread.sleep(5000);
                    }catch (Exception e){
                        System.out.println("bk");
                    }

                },
                //2.设置执行周期(Trigger)
                triggerContext -> {
                    //2.1 从数据库获取执行周期
                    String cron = cronMapper.selectList(null).get(0).getCron();
                    //2.2 合法性校验.
                    if (StringUtils.isEmpty(cron)) {
                        // Omitted Code ..
                    }
                    //2.3 返回执行周期(Date)
                    return new CronTrigger(cron).nextExecutionTime(triggerContext);
                }
        );
    }

}
