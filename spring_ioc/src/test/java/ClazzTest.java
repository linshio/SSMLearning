import cn.linshio.pojo.Clazz;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClazzTest {
    @Test
    public void test() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Clazz clazz = context.getBean("clazz", Clazz.class);
        System.out.println(clazz);
    }
}
