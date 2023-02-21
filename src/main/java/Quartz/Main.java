package Quartz;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Author:冯嘉裕
 * Date2022/12/8 21:29
 **/
public class Main {
    public static void main(String[] args) throws SchedulerException {
        // 调试器
        Scheduler scheduler = new StdSchedulerFactory().getScheduler();
        //任务
        JobDetail job = JobBuilder.newJob().ofType(UserQuartz.class).usingJobData("name", "1111111111").build();

        // 调试时间配置
        Trigger trigger =TriggerBuilder.newTrigger().startNow()
                // 每5秒钟执行一次
                .withSchedule(CronScheduleBuilder.cronSchedule("0/5 * * * * ?")).build();

        // 加入调度
        scheduler.scheduleJob(job, trigger);
        // 启动
        scheduler.start();

    }
}
