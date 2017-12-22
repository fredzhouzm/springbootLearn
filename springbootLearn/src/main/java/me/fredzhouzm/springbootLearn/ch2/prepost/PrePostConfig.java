package me.fredzhouzm.springbootLearn.ch2.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * <h1> 请在此输入当前类描述 </h1>
 *
 * @author fred.zhou
 * @version PrePostConfig.java, 1.0.0
 * @time 2017/12/22 15:14
 */
@Configuration
@ComponentScan("me.fredzhouzm.springbootLearn.ch2.prepost")
public class PrePostConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    BeanWayService beanWayService() {
        return new BeanWayService();
    }

    @Bean
    JSR250WayService jsr250WayService() {
        return new JSR250WayService();
    }
}
