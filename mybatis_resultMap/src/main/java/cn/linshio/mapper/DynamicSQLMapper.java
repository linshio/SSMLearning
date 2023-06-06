package cn.linshio.mapper;

import cn.linshio.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DynamicSQLMapper {
    //根据条件查询emp
    List<Emp> getEmpByCondition(Emp emp);

    //批量添加emp
    void insertMoreEmp(@Param("emps") List<Emp> emps);

    //根据id进行批量删除
    void deleteMoreEmp(@Param("empIds") Integer[] empIds);
}
