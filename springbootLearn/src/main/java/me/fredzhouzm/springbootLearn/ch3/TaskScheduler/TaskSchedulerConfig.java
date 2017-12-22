package me.fredzhouzm.springbootLearn.ch3.TaskScheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * <h1> 请在此输入当前类描述 </h1>
 *
 * @author fred.zhou
 * @version TaskSchedulerConfig.java, 1.0.0
 * @time 2017/12/22 16:13
 */
@Configuration
@ComponentScan("me.fredzhouzm.springbootLearn.ch3.TaskScheduler")
@EnableScheduling
public class TaskSchedulerConfig {
}
