package me.fredzhouzm.springbootLearn.ch1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <h1> 请在此输入当前类描述 </h1>
 *
 * @author fred.zhou
 * @version MainRun.java, 1.0.0
 * @time 2017/12/21 19:34
 */
public class MainRun {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(DiConfig.class);
        UseFunctionService useFunctionService = annotationConfigApplicationContext.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.sayHello("di"));
        annotationConfigApplicationContext.close();
    }
}
