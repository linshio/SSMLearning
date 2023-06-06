package cn.linshio.mapper;

import cn.linshio.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SpecialSQLMapper {
    //模糊查询
    List<User> selectBySpecial(@Param("mohu") String mohu);

    //批量删除
    void deleteMoreUser(@Param("ids") String ids);

    //获取到自增的主键
    void insertUser(User user);
}
