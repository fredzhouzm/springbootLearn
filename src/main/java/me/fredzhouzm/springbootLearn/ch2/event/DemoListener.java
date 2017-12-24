package me.fredzhouzm.springbootLearn.ch2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * <h1> 请在此输入当前类描述 </h1>
 *
 * @author fred.zhou
 * @version DemoListener.java, 1.0.0
 * @time 2017/12/22 15:36
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    public void onApplicationEvent(DemoEvent event) {
        String message = event.getMessage();
        System.out.println("我（Bean-DemoListener）收到了来自Bean-DemoPublisher发布的消息：" + message);
    }
}
