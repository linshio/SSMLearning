package cn.linshio.aop.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
//设置切面的优先级，数字越小优先级就越高
@Order(2)
public class LoggerAspect {

    //切入点表达式的重用
    @Pointcut("execution(* cn.linshio.aop.annotation.CalculatorImpl.*(..))")
    public void pointCut() {
    }

    @Before(value = "execution(* cn.linshio.aop.annotation.CalculatorImpl.*(..))")
    public void beforeMethodInform(JoinPoint joinPoint) {
        //获取连接点所对应的方法名
        Signature signature = joinPoint.getSignature();
        System.out.println(">前置通知,方法：" + signature.getName() + "参数为：" +
                Arrays.toString(joinPoint.getArgs()));

    }

    @After("pointCut()")
    public void afterMethodInform(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        System.out.println(">后置通知，方法：" + signature.getName() + ",执行完毕");
    }

    //返回通知  returning可以获取到返回值
    @AfterReturning(value = "pointCut()", returning = "result")
    public void afterReturnMethodInform(JoinPoint joinPoint, Object result) {
        Signature signature = joinPoint.getSignature();
        System.out.println(">返回通知" + "方法：" + signature.getName() + " 返回值为：" + result);
    }

    //异常通知
    @AfterThrowing(value = "pointCut()", throwing = "ex")
    public void afterExceptionMethodInform(JoinPoint joinPoint, Throwable ex) {
        Signature signature = joinPoint.getSignature();
        System.out.println(">异常通知" + "方法：" + signature.getName() + "异常=>" + ex);
    }

    //环绕通知 有点像动态代理那种类型的,ProceedingJoinPoint表示代理对象需要执行的方法
    @Around("pointCut()")
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
