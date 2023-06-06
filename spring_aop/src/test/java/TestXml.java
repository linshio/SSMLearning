import cn.linshio.aop.xml.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXml {
    @Test
    public void test() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("aop-xml.xml");
        Calculator bean = context.getBean(Calculator.class);
        bean.div(2, 1);
    }
}
