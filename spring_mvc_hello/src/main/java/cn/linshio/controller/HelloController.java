package cn.linshio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

/*    @RequestMapping("/")
    public String index(){
        return "index";
    }*/

    @RequestMapping(
            value = "/hello",
            method = {RequestMethod.GET, RequestMethod.POST},
            params = {}
    )
    public String hello() {
        return "success";
    }

    //PathVariable 注解标注键
    @GetMapping("/rest/{id}")
    public String testRest(@PathVariable("id") Integer id) {
        System.out.println("id==>" + id);
        return "success";
    }
}
