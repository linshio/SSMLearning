import cn.linshio.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireTest {
    @Test
    public void test() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-auto.xml");
        UserController controller = context.getBean(UserController.class);
        controller.saveUser();
    }
}
