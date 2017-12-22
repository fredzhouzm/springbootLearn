package me.fredzhouzm.springbootLearn.ch2.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

/**
 * <h1> 请在此输入当前类描述 </h1>
 *
 * @author fred.zhou
 * @version ProfileConfig.java, 1.0.0
 * @time 2017/12/22 15:23
 */
public class ProfileConfig {

    @Bean
    @Profile("dev")
    public DemoBean devDemoBean(){
        return new DemoBean("from development environment profile");
    }

    @Bean
    @Profile("prod")
    public DemoBean prodDemoBean(){
        return new DemoBean("from production environment profile");
    }
}
