package me.fredzhouzm.springbootLearn.ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <h1> 请在此输入当前类描述 </h1>
 *
 * @author fred.zhou
 * @version UseFunctionService.java, 1.0.0
 * @time 2017/12/21 19:30
 */
@Service
public class UseFunctionService {

    @Autowired
    FunctionService functionService;

    public String sayHello(String word) {
        return functionService.sayHello(word);
    }
}
