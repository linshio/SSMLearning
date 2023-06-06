package cn.linshio.mapper;

import cn.linshio.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {
    //根据id查询emp的信息
//    Emp getEmpById(@Param("empId")Integer empId);
//
//    //根据empId获取到员工和部门的信息两表联查
//    Emp getEmpAndDeptById(@Param("empId")Integer empId);
//
//    Emp getEmpAndDeptByStepOne(@Param("empId")Integer empId);
//
//    //分步查询的第二步
//    List<Emp> getDeptAndEmpByStepTwo(@Param("deptId")Integer deptId);
}
