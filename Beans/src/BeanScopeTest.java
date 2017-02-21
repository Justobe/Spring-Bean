import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by YanMing on 2017/2/21.
 */
public class BeanScopeTest {
    @Test
    public void say() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        BeanScope beanScope1 = (BeanScope) context.getBean("beanscope");
        BeanScope beanScope2 = (BeanScope) context.getBean("beanscope");

        beanScope1.say();
        beanScope2.say();

    }

}