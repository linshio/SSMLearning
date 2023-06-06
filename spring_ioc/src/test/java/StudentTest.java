import cn.linshio.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
    @Test
    public void test() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student);
    }
}
