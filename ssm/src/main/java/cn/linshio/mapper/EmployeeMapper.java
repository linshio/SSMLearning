package cn.linshio.mapper;

import cn.linshio.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper {
    List<Employee> getAllEmployee();

    Employee getEmployeeById(@Param("id") Integer id);

}
