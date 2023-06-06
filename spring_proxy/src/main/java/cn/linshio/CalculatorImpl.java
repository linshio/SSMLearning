package cn.linshio;

public class CalculatorImpl implements Calculator {
    @Override
    public int add(int a, int b) {
        int result = a + b;
        System.out.println("函数执行中,结果为" + result);
        return result;
    }
}
