import cn.linshio.mapper.SelectMapper;
import cn.linshio.pojo.User;
import cn.linshio.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class SelectTest {
    @Test
    public void getUserById() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void getAllUsers() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<User> allUsers = mapper.getAllUsers();
        allUsers.forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void countUser() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.countUser());
        sqlSession.close();
    }

    @Test
    public void getUserByIdToMap() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Map<String, Object> map = mapper.getUserByIdToMap(6);
        System.out.println(map);
        sqlSession.close();
    }

    @Test
    public void getAllUserByMap() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);

        //第一种处理方式，将其转化为list
//        List<Map<String, Object>> allUserByMap = mapper.getAllUserByMap();
//        allUserByMap.forEach(System.out::println);

        //第二种处理方式，将其转化为更大的map
        Map<String, Object> map = mapper.getAllUserByMap();
        System.out.println(map);
        sqlSession.close();
    }
}
