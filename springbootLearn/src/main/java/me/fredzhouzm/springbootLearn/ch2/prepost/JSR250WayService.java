package me.fredzhouzm.springbootLearn.ch2.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * <h1> 请在此输入当前类描述 </h1>
 *
 * @author fred.zhou
 * @version JSR250WayService.java, 1.0.0
 * @time 2017/12/22 15:13
 */
public class JSR250WayService {

    public JSR250WayService() {
        super();
        System.out.println("初始化构造函数-JSR250WayService");
    }

    @PostConstruct
    public void init() {
        System.out.println("jsr-250-init-method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("jsr-250-destroy-method");
    }
}
