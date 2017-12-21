package me.fredzhouzm.springbootLearn.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * <h1> 请在此输入当前类描述 </h1>
 *
 * @author fred.zhou
 * @version AopConfig.java, 1.0.0
 * @time 2017/12/21 20:03
 */
@Configuration
@ComponentScan("me.fredzhouzm.springbootLearn.ch1.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
