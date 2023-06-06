import cn.linshio.mapper.SpecialSQLMapper;
import cn.linshio.pojo.User;
import cn.linshio.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class SpecialSQLTest {
    @Test
    public void moHuSelect() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        List<User> users = mapper.selectBySpecial("a");
        users.forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void deleteMoreUser() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        mapper.deleteMoreUser("9,10");
        sqlSession.close();
    }

    @Test
    public void insertUser() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        User user = new User(null, "aaz", "123098", 23, "男", "3@qq.com");
        mapper.insertUser(user);
        System.out.println(user);
        sqlSession.close();
    }
}
