package cn.linshio.mapper;

import cn.linshio.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    //分步查询的第二步
//    Dept getEmpAndDeptByStepTwo(@Param("deptId")Integer deptId);
//
//    //根据deptId查询该部门以及部门中的员工信息
//    Dept getDeptAndEmpById(@Param("deptId") Integer deptId);
//
//    //查询部门信息分步查询one
//    Dept getDEptByStepOne(@Param("deptId") Integer deptId);
}
