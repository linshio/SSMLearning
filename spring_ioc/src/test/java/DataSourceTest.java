import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;
import java.time.Duration;

public class DataSourceTest {
    @Test
    public void test() throws SQLException {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-datasource.xml");
        DruidDataSource source = context.getBean(DruidDataSource.class);
        System.out.println(source.getConnection());
    }
}
