package me.fredzhouzm.springbootLearn.ch1.di;

import org.springframework.stereotype.Service;

/**
 * <h1> 请在此输入当前类描述 </h1>
 *
 * @author fred.zhou
 * @version FunctionService.java, 1.0.0
 * @time 2017/12/21 19:29
 */
@Service
public class FunctionService {

    public String sayHello(String word) {
        return "Hello " + word + " !";
    }
}
