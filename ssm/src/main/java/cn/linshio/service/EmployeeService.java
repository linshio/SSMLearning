package cn.linshio.service;

import cn.linshio.pojo.Employee;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface EmployeeService {
//    List<Employee> getAllEmployees();

    PageInfo<Employee> getEmployeePage(Integer pageNum);

    //根据id查询员工
    Employee getEmployeeById(Integer id);
}
