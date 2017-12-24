package me.fredzhouzm.springbootLearn.ch3.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <h1> 请在此输入当前类描述 </h1>
 *
 * @author fred.zhou
 * @version MainRun.java, 1.0.0
 * @time 2017/12/22 17:38
 */
public class MainRun {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionalConfig.class);
        ListService listService = context.getBean(ListService.class);
        System.out.println(context.getEnvironment().getProperty("os.name")+" 系统下的列表命令为："+listService.showListCmd());
        context.close();
    }
}
