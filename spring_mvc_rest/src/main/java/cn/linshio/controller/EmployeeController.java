package cn.linshio.controller;

import cn.linshio.dao.EmployeeDao;
import cn.linshio.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;

//查询所有的员工信息-->/employee -->get
//跳转到添加数据页面-->/to/add -->get
//新增员工信息-->/employee -->post
//跳转到更新数据页面-->/employee/{id} -->get
//修改员工信息-->/employee -->put
//删除员工信息-->/employee/{id} -->delete

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    //查询所有的员工信息
    @GetMapping("/employee")
    public ModelAndView getAllEmployee() {
        Collection<Employee> employees = employeeDao.getAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("employees", employees);
        modelAndView.setViewName("employee_list");
        return modelAndView;
    }

    //新增员工信息
    @PostMapping("/employee")
    public String addEmployee(Employee employee) {
        employeeDao.save(employee);
        return "redirect:/employee";
    }

    //根据id查找员工，回显到指定的页面上
    @GetMapping("/employee/{id}")
    public String getEmployeeById(@PathVariable("id") Integer id, Model model) {
        Employee employee = employeeDao.get(id);
        model.addAttribute("employee", employee);
        return "employee_update";
    }

    //将修改之后的页面进行提交
    @PutMapping("/employee")
    public String updateEmployee(Employee employee) {
        employeeDao.save(employee);
        return "redirect:/employee";
    }

    //删除用户的信息
    @DeleteMapping("/employee/{id}")
    public String deleteEmployee(@PathVariable("id") Integer id) {
        employeeDao.delete(id);
        return "redirect:/employee";
    }
}
