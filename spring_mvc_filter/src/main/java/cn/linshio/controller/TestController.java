package cn.linshio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/error")
    public String error() {
        System.out.println(1 / 0);
        return "index";
    }
}
