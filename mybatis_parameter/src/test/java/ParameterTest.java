import cn.linshio.mapper.UserMapper;
import cn.linshio.pojo.User;
import cn.linshio.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class ParameterTest {
    @Test
    public void getUserByUsername() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserByName("az");
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void getUser() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserForCheck("az", "123456");
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void insertUser() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(null, "za", "666666", 44, "女", "123@qq.com");
        mapper.insertUser(user);
        sqlSession.close();
    }

    @Test
    public void getUserByParam() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserForCheck("za", "666666");
        System.out.println(user);
        sqlSession.close();
    }
}
