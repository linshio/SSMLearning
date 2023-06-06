import cn.linshio.mapper.EmpMapper;
import cn.linshio.pojo.Emp;
import cn.linshio.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class EmpTest {
//    @Test
//    public void getEmpById(){
//        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
//        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
//        Emp emp = mapper.getEmpById(1);
//        System.out.println(emp);
//        sqlSession.close();
//    }
//
//    @Test
//    public void getEmpAndDeptById(){
//        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
//        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
//        Emp emp = mapper.getEmpAndDeptById(2);
//        System.out.println(emp);
//        sqlSession.close();
//    }
//
//    @Test
//    public void getEmpAndDeptByStep(){
//        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
//        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
//        Emp emp = mapper.getEmpAndDeptByStepOne(3);
//        System.out.println(emp);
//        sqlSession.close();
//    }
}
