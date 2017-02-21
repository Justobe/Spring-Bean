
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by YanMing on 2017/2/20.
 */


public class JugglerTest {
    @Test
    public void setBeanBags() throws Exception {

    }

    @Test
    public void perform() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Juggler juggler = (PoeticJuggler) context.getBean("duke");
        juggler.perform();
    }

}