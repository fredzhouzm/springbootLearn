package me.fredzhouzm.springbootLearn.ch3.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

/**
 * <h1> 请在此输入当前类描述 </h1>
 *
 * @author fred.zhou
 * @version AwareService.java, 1.0.0
 * @time 2017/12/22 15:48
 */
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {

    private String beanName;
    private ResourceLoader resourceLoader;

    public void setBeanName(String name) {
        this.beanName = name;
    }

    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public void outputResult() {
        System.out.println("Bean的名称为：" + beanName);
        Resource resource = resourceLoader.getResource("classpath:me/fredzhouzm/springbootLearn/ch2/el/test.txt");
        try {
            System.out.println("ResourceLoader加载的文件内容为：" + IOUtils.toString(resource.getInputStream(), "UTF-8"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
