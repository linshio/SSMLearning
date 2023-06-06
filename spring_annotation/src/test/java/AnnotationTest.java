import cn.linshio.annotation.controller.UserController;
import cn.linshio.annotation.dao.UserDao;
import cn.linshio.annotation.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {
    @Test
    public void test() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-annotation.xml");
        UserController controller = context.getBean("userController", UserController.class);
        controller.saveUser();
    }
}
