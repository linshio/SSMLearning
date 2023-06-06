import cn.linshio.mybatis.mapper.EmpMapper;
import cn.linshio.mybatis.pojo.Emp;
import cn.linshio.mybatis.pojo.EmpExample;
import cn.linshio.mybatis.utils.SqlSessionUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class PageTest {
    @Test
    public void test() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        //EmpExample empExample = new EmpExample();
        //查询之前开启分页功能
        PageHelper.startPage(1, 4);
        List<Emp> emps = mapper.selectByExample(null);
        //查询功能之后可以获取分页相关的所有数据
        PageInfo<Emp> pageInfo = new PageInfo<>(emps, 5);
        emps.forEach(System.out::println);
        System.out.println(pageInfo);
        sqlSession.close();
    }
}
