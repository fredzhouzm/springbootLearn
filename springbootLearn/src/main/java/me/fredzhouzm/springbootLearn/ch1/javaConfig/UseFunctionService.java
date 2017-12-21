package me.fredzhouzm.springbootLearn.ch1.javaConfig;

/**
 * <h1> 请在此输入当前类描述 </h1>
 *
 * @author fred.zhou
 * @version UseFunctionService.java, 1.0.0
 * @time 2017/12/21 19:30
 */
public class UseFunctionService {

    FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String sayHello(String word) {
        return functionService.sayHello(word);
    }
}
