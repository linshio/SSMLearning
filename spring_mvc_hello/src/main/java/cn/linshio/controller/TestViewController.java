package cn.linshio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestViewController {
    @RequestMapping("/thymeleaf")
    public ModelAndView testThymeleaf() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping("/forward")
    public String testForward() {
        return "forward:/model";
    }

    @RequestMapping("/redirect")
    public String testRedirect() {
        return "redirect:/model";
    }

}
