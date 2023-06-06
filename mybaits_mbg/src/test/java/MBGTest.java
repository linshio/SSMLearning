import cn.linshio.mybatis.mapper.EmpMapper;
import cn.linshio.mybatis.pojo.Emp;
import cn.linshio.mybatis.pojo.EmpExample;
import cn.linshio.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MBGTest {
    @Test
    public void test() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
//        Emp emp = mapper.selectByPrimaryKey(1);
//        System.out.println(emp);
//        List<Emp> emps = mapper.selectByExample(null);
//        emps.forEach(System.out::println);

        EmpExample empExample = new EmpExample();
        empExample.createCriteria().andAgeGreaterThanOrEqualTo(20).andGenderEqualTo("男");
        empExample.or().andDeptIdEqualTo(3);
        List<Emp> emps = mapper.selectByExample(empExample);
        emps.forEach(System.out::println);
        sqlSession.close();
    }
}
