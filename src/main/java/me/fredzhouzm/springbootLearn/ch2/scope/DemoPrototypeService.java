package me.fredzhouzm.springbootLearn.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * <h1> 请在此输入当前类描述 </h1>
 *
 * @author fred.zhou
 * @version DemoPrototypeService.java, 1.0.0
 * @time 2017/12/21 20:13
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {
}
