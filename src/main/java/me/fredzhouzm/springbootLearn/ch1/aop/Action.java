package me.fredzhouzm.springbootLearn.ch1.aop;

import java.lang.annotation.*;

/**
 * <h1> 请在此输入当前类描述 </h1>
 *
 * @author fred.zhou
 * @version Action.java, 1.0.0
 * @time 2017/12/21 19:53
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
