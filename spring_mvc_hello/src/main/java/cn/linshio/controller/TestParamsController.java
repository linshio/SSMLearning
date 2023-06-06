package cn.linshio.controller;

import cn.linshio.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
//获取到参数的集中方式
public class TestParamsController {

    @PostMapping("/param/servlet")
    public String testServlet(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username=>" + username + "  password==>" + password);
        return "success";
    }

    //RequestParam将请求参数与控制器方法的形参进行绑定
    @PostMapping("/param")
    public String param(@RequestParam("username") String username, String password) {
        System.out.println("username=>" + username + "  password==>" + password);
        return "success";
    }

    //使用pojo获取请求参数
    @RequestMapping("/param/pojo")
    public String pojo(User user) {
        System.out.println(user);
        return "success";
    }
}
