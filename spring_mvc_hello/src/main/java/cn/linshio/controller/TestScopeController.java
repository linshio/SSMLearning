package cn.linshio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.util.Map;

//往域中对象共享数据
@Controller
public class TestScopeController {
    //推荐
    @RequestMapping("/mav")
    public ModelAndView mav() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("testData", "modelAndView");
        modelAndView.setViewName("success");
        return modelAndView;
    }

    //model
    @RequestMapping("/model")
    public String model(Model model) {
        model.addAttribute("testData", "model");
        return "success";
    }

    //modelMap
    @RequestMapping("/modelMap")
    public String modelMap(ModelMap modelMap) {
        modelMap.addAttribute("testData", "modelMap");
        return "success";
    }

    //map
    @RequestMapping("/map")
    public String map(Map<String, Object> map) {
        map.put("testData", "map");
        return "success";
    }

    //往session中存数据
    @RequestMapping("/session")
    public String session(HttpSession session) {
        session.setAttribute("testSession", "h->session");
        return "success";
    }

    //往application中存数据
    @RequestMapping("/application")
    public String application(HttpSession session) {
        ServletContext context = session.getServletContext();
        context.setAttribute("testContext", "h->Context");
        return "success";
    }
}
