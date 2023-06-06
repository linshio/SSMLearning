package cn.linshio.service.impl;

import cn.linshio.mapper.EmployeeMapper;
import cn.linshio.pojo.Employee;
import cn.linshio.service.EmployeeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;


//    @Override
//    public List<Employee> getAllEmployees() {
//        return employeeMapper.getAllEmployee();
//    }

    @Override
    public PageInfo<Employee> getEmployeePage(Integer pageNum) {
        //开启分页功能
        PageHelper.startPage(pageNum, 5);
        //查询所有的员工信息
        List<Employee> employees = employeeMapper.getAllEmployee();
        //这个第二个参数为导航分页
        return new PageInfo<>(employees, 5);
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        return employeeMapper.getEmployeeById(id);
    }
}
