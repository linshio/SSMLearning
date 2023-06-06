package cn.linshio.controller;

import cn.linshio.pojo.Employee;
import cn.linshio.service.EmployeeService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//查询所有的员工信息-->/employee-->get
//查询所有的员工的分页信息-->/employee/page/1-->get
//根据id查询员工信息-->/employee/1-->get
//跳转到添加页面-->/to/add-->get
//添加员工信息-->/employee-->post
//修改员工信息-->/employee-->put
//删除员工信息-->/employee-->delete
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    //查询当前员工的分页信息
    @GetMapping("/employee/page/{pageNum}")
    public String getEmployeePage(@PathVariable("pageNum") Integer pageNum, Model model) {
        PageInfo<Employee> page = employeeService.getEmployeePage(pageNum);
        model.addAttribute("page", page);
        return "employee_list";
    }

    //根据id查询员工信息-->/employee/1-->get
    @GetMapping("/employee/{id}")
    public String getEmployeeById(@PathVariable("id") Integer id, Model model) {
        Employee employee = employeeService.getEmployeeById(id);
        model.addAttribute("employee", employee);
        return "employee";
    }


//    @GetMapping("/employee")
//    public String getAllEmployees(Model model){
//        List<Employee> employees = employeeService.getAllEmployees();
//        model.addAttribute("employees",employees);
//        return "employee_list";
//    }


}
