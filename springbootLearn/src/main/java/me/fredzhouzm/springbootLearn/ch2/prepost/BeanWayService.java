package me.fredzhouzm.springbootLearn.ch2.prepost;

/**
 * <h1> 请在此输入当前类描述 </h1>
 *
 * @author fred.zhou
 * @version BeanWayService.java, 1.0.0
 * @time 2017/12/22 15:10
 */
public class BeanWayService {

    public BeanWayService() {
        super();
        System.out.println("初始化构造函数-BeanWayService");
    }

    public void init() {
        System.out.println("@Bean-init-method");
    }

    public void destroy() {
        System.out.println("@Bean-destroy-method");
    }
}
