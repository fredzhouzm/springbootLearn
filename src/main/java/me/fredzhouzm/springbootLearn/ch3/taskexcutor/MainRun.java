package me.fredzhouzm.springbootLearn.ch3.taskexcutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <h1> 请在此输入当前类描述 </h1>
 *
 * @author fred.zhou
 * @version MainRun.java, 1.0.0
 * @time 2017/12/22 16:03
 */
public class MainRun {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExcutorConfig.class);
        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);
        for (int i = 0; i < 100; i++) {
            asyncTaskService.executeAsyncTask(i);
            asyncTaskService.excuteAsyncTaskPlus(i);
        }
        context.close();
    }
}
