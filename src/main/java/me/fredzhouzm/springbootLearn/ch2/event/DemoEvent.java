package me.fredzhouzm.springbootLearn.ch2.event;

import org.springframework.context.ApplicationEvent;

/**
 * <h1> 请在此输入当前类描述 </h1>
 *
 * @author fred.zhou
 * @version DemoEvent.java, 1.0.0
 * @time 2017/12/22 15:32
 */
public class DemoEvent extends ApplicationEvent {

    private String message;

    public DemoEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
