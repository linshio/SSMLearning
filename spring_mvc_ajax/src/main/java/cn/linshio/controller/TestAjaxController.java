package cn.linshio.controller;

import cn.linshio.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

@Controller
public class TestAjaxController {
    @RequestMapping("/test/ajax")
    public void testAjax(Integer id, @RequestBody String requestBody, HttpServletResponse response) throws IOException {
        System.out.println("requestBody==>" + requestBody);
        System.out.println("id==>" + id);
        response.getWriter().println("hello,ajax");
    }

    //@RequestMapping("/requestBody/json")
    public void testRequestBody(HttpServletResponse response, @RequestBody User user) throws IOException {
        System.out.println(user);
        response.getWriter().println("hello,RequestBody");
    }

    @RequestMapping("/requestBody/json")
    public void testRequestBody(HttpServletResponse response, @RequestBody Map<String, Object> map) throws IOException {
        System.out.println(map);
        response.getWriter().println("hello,RequestBody");
    }

    //@ResponseBody将所标识的控制器方法返回作为响应报文的响应体响应到浏览器
    @RequestMapping("/test/ResponseBody")
    @ResponseBody
    public String testResponseBody() {
        return "success";
    }

    //@ResponseBody将所标识的控制器方法返回作为响应报文的响应体响应到浏览器
    @RequestMapping("/test/ResponseBody/json")
    @ResponseBody
//    public User testResponseBodyJson(){
//        return new User("az","55555",22,"男");
//    }
//    public Map<String,Object> testResponseBodyJson(){
//        User user1 = new User("az", "55555", 22, "男");
//        User user2 = new User("az", "55555", 22, "男");
//        User user3 = new User("az", "55555", 22, "男");
//        HashMap<String, Object> map = new HashMap<>();
//        map.put("user1",user1);
//        map.put("user2",user2);
//        map.put("user3",user3);
//        return map;
//    }
    public List<User> testResponseBodyJson() {
        User user1 = new User("az", "55555", 22, "男");
        User user2 = new User("az", "55555", 22, "男");
        User user3 = new User("az", "55555", 22, "男");
        return Arrays.asList(user1, user2, user3);
    }
}
