package me.fredzhouzm.springbootLearn.ch3.TaskScheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <h1> 请在此输入当前类描述 </h1>
 *
 * @author fred.zhou
 * @version ScheduledTaskService.java, 1.0.0
 * @time 2017/12/22 16:09
 */
@Service
public class ScheduledTaskService {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("每隔5秒执行一次：" + dateFormat.format(new Date()));
    }

    @Scheduled(cron = "0 15 16 ? * *")
    public void fixTimeExcution() {
        System.out.println("在指定时间 " + dateFormat.format(new Date()) + " 执行");
    }
}
