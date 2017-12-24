package me.fredzhouzm.springbootLearn.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * <h1> 请在此输入当前类描述 </h1>
 *
 * @author fred.zhou
 * @version DemoAnnotationService.java, 1.0.0
 * @time 2017/12/21 19:55
 */
@Service
public class DemoAnnotationService {

    @Action(name = "注解式拦截的add操作")
    public void add() {
    }
}
