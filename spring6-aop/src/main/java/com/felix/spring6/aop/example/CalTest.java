package com.felix.spring6.aop.example;

/**
 * ClassName:CalTest
 * Package:com.felix.spring6.aop.example
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/22 11:32
 * @Version 1.0
 */
public class CalTest {
    public static void main(String[] args) {

        //1.创建代理对象(动态)
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator) proxyFactory.getProxy();
        proxy.add(1,5);
    }
}
