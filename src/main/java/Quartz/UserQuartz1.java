package Quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * Author:冯嘉裕
 * Date2022/12/8 21:26
 **/
public class UserQuartz1 implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("五秒启动一次2222222222222");
    }
}
