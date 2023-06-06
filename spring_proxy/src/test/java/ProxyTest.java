import cn.linshio.Calculator;
import cn.linshio.CalculatorImpl;
import cn.linshio.ProxyFactory;
import org.junit.Test;

public class ProxyTest {
    @Test
    public void test() {
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator) proxyFactory.getProxy();
        proxy.add(1, 2);
    }
}
