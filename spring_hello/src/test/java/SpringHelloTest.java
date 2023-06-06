import cn.linshio.spring.pojo.Hello;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloTest {
    @Test
    public void helloTest() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-config.xml");
        Hello bean = context.getBean(Hello.class);
        bean.helloWorld();
    }
}
