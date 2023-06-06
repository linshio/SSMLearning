import cn.linshio.pojo.User;
import cn.linshio.pojo.UserFactoryBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryBeanTest {
    @Test
    public void test() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("factoryBean.xml");
        User user = context.getBean(User.class);
        System.out.println(user);
    }
}
