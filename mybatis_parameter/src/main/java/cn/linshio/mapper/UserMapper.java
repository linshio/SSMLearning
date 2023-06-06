package cn.linshio.mapper;

import cn.linshio.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    //根据用户名来获取用户信息
    User getUserByName(String username);

    //根据用户名与密码查询用户信息
    User getUserForCheck(String username, String password);

    //插入用户信息，参数放入对象
    void insertUser(User user);

    //通过注解根据用户名与密码查询用户信息
    User getUserByParam(@Param("username") String username,
                        @Param("password") String password);


}
