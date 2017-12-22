package me.fredzhouzm.springbootLearn.ch2.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

/**
 * <h1> 请在此输入当前类描述 </h1>
 *
 * @author fred.zhou
 * @version ElConfig.java, 1.0.0
 * @time 2017/12/22 14:35
 */
@Configuration
@ComponentScan("me.fredzhouzm.springbootLearn.ch2.el")
@PropertySource("classpath:me/fredzhouzm/springbootLearn/ch2/el/test.properties")
public class ElConfig {

    @Value("I Love You")
    private String normal;

    @Value("#{systemProperties['os.name']}")
    private String osName;

    @Value("#{T(java.lang.Math).random()*100.0}")
    private double randomNumber;

    @Value("#{demoService.another}")
    private String fromAhother;

    @Value("classpath:me/fredzhouzm/springbootLearn/ch2/el/test.txt")
    private Resource testFile;

    @Value("https://www.baidu.com")
    private Resource testUrl;

    @Value("${book.name}")
    private String bookName;

    @Autowired
    private Environment environment;

    public void outputResource() {
        try {
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(randomNumber);
            System.out.println(fromAhother);

            System.out.println(IOUtils.toString(testFile.getInputStream(), "UTF-8"));
            System.out.println(IOUtils.toString(testUrl.getInputStream(), "UTF-8"));
            System.out.println(bookName);
            System.out.println(environment.getProperty("book.author"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
