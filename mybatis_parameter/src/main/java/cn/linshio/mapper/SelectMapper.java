package cn.linshio.mapper;

import cn.linshio.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface SelectMapper {
    //根据id查询用户的信息
    User getUserById(@Param("id") Integer id);

    //查询所有的用户信息
    List<User> getAllUsers();

    //查询记录数
    int countUser();

    //根据id查询用户的信息(使用map集合)
    Map<String, Object> getUserByIdToMap(@Param("id") Integer id);

    //查询所有的用户信息(使用map集合)
//    List<Map<String, Object>> getAllUserByMap();
    //将其id指定为最终大集合的键
    @MapKey("id")
    Map<String, Object> getAllUserByMap();

}
