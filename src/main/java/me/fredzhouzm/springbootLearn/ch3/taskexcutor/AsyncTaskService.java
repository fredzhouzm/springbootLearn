package me.fredzhouzm.springbootLearn.ch3.taskexcutor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * <h1> 请在此输入当前类描述 </h1>
 *
 * @author fred.zhou
 * @version AsyncTaskService.java, 1.0.0
 * @time 2017/12/22 16:00
 */
@Service
public class AsyncTaskService {

    @Async
    public void executeAsyncTask(Integer i) {
        System.out.println("当前线程为：" + Thread.currentThread().getName() + "，执行异步任务：" + i);
    }

    @Async
    public void excuteAsyncTaskPlus(Integer i) {
        System.out.println("当前线程为：" + Thread.currentThread().getName() + "，执行异步任务+1：" + (i + 1));
    }
}
