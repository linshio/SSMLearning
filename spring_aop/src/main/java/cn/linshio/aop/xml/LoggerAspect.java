package cn.linshio.aop.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
//设置切面的优先级，数字越小优先级就越高
public class LoggerAspect {

    public void beforeMethodInform(JoinPoint joinPoint) {
        //获取连接点所对应的方法名
        Signature signature = joinPoint.getSignature();
        System.out.println(">前置通知,方法：" + signature.getName() + "参数为：" +
                Arrays.toString(joinPoint.getArgs()));

    }

    public void afterMethodInform(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        System.out.println(">后置通知，方法：" + signature.getName() + ",执行完毕");
    }

    //返回通知  returning可以获取到返回值
    public void afterReturnMethodInform(JoinPoint joinPoint, Object result) {
        Signature signature = joinPoint.getSignature();
        System.out.println(">返回通知" + "方法：" + signature.getName() + " 返回值为：" + result);
    }

    //异常通知
    public void afterExceptionMethodInform(JoinPoint joinPoint, Throwable ex) {
        Signature signature = joinPoint.getSignature();
        System.out.println(">异常通知" + "方法：" + signature.getName() + "异常=>" + ex);
    }

    //环绕通知 有点像动态代理那种类型的,ProceedingJoinPoint表示代理对象需要执行的方法
    public Object aroundMethodInform(ProceedingJoinPoint joinPoint) {
        Object result = null;
        try {
            System.out.println(">>环绕>前置通知");
            result = joinPoint.proceed();
            System.out.println(">>环绕>返回通知");
        } catch (Throwable e) {
            System.out.println(">>环绕>异常通知");
            throw new RuntimeException(e);
        } finally {
            System.out.println(">>环绕>后置通知");
        }
        return result;
    }


}
