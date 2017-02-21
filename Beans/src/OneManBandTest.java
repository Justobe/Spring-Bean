import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import static org.junit.Assert.*;

/**
 * Created by YanMing on 2017/2/20.
 */
public class OneManBandTest {

    @Test
    public void perform() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        OneManBand oneManBand = (OneManBand) context.getBean("onemanband");
        oneManBand.perform();

        OneManBand oneManBand2 = (OneManBand) context.getBean("onemanband");
        oneManBand2.perform();

    }

    @Test
    public void setInstruments() throws Exception {


    }

}