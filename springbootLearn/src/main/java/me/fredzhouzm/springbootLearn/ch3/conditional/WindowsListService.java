package me.fredzhouzm.springbootLearn.ch3.conditional;

/**
 * <h1> 请在此输入当前类描述 </h1>
 *
 * @author fred.zhou
 * @version WindowsListService.java, 1.0.0
 * @time 2017/12/22 17:34
 */
public class WindowsListService implements ListService {
    public String showListCmd() {
        return "dir";
    }
}
