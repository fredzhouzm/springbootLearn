package me.fredzhouzm.springbootLearn.ch3.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <h1> 请在此输入当前类描述 </h1>
 *
 * @author fred.zhou
 * @version MainRun.java, 1.0.0
 * @time 2017/12/22 17:50
 */
public class MainRun {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        DemoService demoService = context.getBean(DemoService.class);
        demoService.outputResult();
        context.close();
    }
}
