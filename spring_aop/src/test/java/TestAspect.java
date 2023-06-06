import cn.linshio.aop.annotation.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAspect {
    @Test
    public void test() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("aop-annotation.xml");

        Calculator calculator = context.getBean(Calculator.class);
        calculator.div(2, 1);
    }
}
