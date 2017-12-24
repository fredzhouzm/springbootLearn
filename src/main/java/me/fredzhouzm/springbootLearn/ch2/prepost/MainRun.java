package me.fredzhouzm.springbootLearn.ch2.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <h1> 请在此输入当前类描述 </h1>
 *
 * @author fred.zhou
 * @version MainRun.java, 1.0.0
 * @time 2017/12/22 15:16
 */
public class MainRun {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);

        BeanWayService beanWayService = context.getBean(BeanWayService.class);
        JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);

        context.close();
    }
}
