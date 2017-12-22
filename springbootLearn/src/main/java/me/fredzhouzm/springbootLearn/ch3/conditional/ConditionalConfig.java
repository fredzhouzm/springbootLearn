package me.fredzhouzm.springbootLearn.ch3.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * <h1> 请在此输入当前类描述 </h1>
 *
 * @author fred.zhou
 * @version ConditionalConfig.java, 1.0.0
 * @time 2017/12/22 17:36
 */
@Configuration
public class ConditionalConfig {

    @Bean
    @Conditional(WindowsCondition.class)
    public ListService windowsListService() {
        return new WindowsListService();
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public ListService linuxListService() {
        return new LinuxListService();
    }
}
