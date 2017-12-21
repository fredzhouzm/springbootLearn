package me.fredzhouzm.springbootLearn.ch2.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <h1> 请在此输入当前类描述 </h1>
 *
 * @author fred.zhou
 * @version MainRun.java, 1.0.0
 * @time 2017/12/21 20:14
 */
public class MainRun {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);

        DemoSingletonService demoSingletonService1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService demoSingletonService2 = context.getBean(DemoSingletonService.class);

        DemoPrototypeService demoPrototypeService1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService demoPrototypeService2 = context.getBean(DemoPrototypeService.class);

        System.out.println("demoSingletonService1与demoSingletonService2是否相等：" + demoSingletonService1.equals(demoSingletonService2));
        System.out.println("demoPrototypeService1与demoPrototypeService2是否相等：" + demoPrototypeService1.equals(demoPrototypeService2));
        context.close();
    }
}
