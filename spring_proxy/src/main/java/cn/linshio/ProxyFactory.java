package cn.linshio;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ProxyFactory {
    private final CalculatorImpl target;

    public ProxyFactory(CalculatorImpl target) {
        this.target = target;
    }

    public Object getProxy() {
        ClassLoader classLoader = this.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        InvocationHandler h = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("函数名为" + method.getName() + "函数参数" + Arrays.toString(args));
                Object result = method.invoke(target, args);
                System.out.println("函数执行后==> 结果为：" + result);
                return result;
            }
        };
        return Proxy.newProxyInstance(classLoader, interfaces, h);
    }
}
