import cn.linshio.mapper.DynamicSQLMapper;
import cn.linshio.pojo.Emp;
import cn.linshio.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class
DynamicSQLMapperTest {
    @Test
    public void getEmpByCondition() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp(null, "王五", null, "");
        List<Emp> emps = mapper.getEmpByCondition(emp);
        emps.forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void insertEmps() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp1 = new Emp(null, "小明1", 20, "男");
        Emp emp2 = new Emp(null, "小明2", 20, "男");
        Emp emp3 = new Emp(null, "小明3", 20, "男");
        List<Emp> emps = Arrays.asList(emp1, emp2, emp3);
        mapper.insertMoreEmp(emps);
        sqlSession.close();
    }

    @Test
    public void deleteEmps() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Integer[] empIds = {5};
        mapper.deleteMoreEmp(empIds);
        sqlSession.close();
    }
}
