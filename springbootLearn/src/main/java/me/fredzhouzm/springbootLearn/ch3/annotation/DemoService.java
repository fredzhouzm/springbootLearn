package me.fredzhouzm.springbootLearn.ch3.annotation;

import org.springframework.stereotype.Service;

/**
 * <h1> 请在此输入当前类描述 </h1>
 *
 * @author fred.zhou
 * @version DemoService.java, 1.0.0
 * @time 2017/12/22 17:48
 */
@Service
public class DemoService {

    public void outputResult(){
        System.out.println("从组合注解配置照样获得的bean");
    }
}
