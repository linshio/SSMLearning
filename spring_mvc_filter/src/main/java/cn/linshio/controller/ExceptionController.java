package cn.linshio.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//将当前的类标识为异常组件
@ControllerAdvice
public class ExceptionController {

    //设置要处理的异常信息，异常对象
    @ExceptionHandler(ArithmeticException.class)
    public String testException(Throwable ex, Model model) {
        //出现异常进行处理 ex表示出现的异常信息
        model.addAttribute("ex", ex.fillInStackTrace());
        return "error";
    }
}
