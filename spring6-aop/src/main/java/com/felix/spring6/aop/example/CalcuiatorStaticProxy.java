package com.felix.spring6.aop.example;

/**
 * ClassName:CalcuiatorStaticProxy
 * Package:com.felix.spring6.aop.example
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/22 10:57
 * @Version 1.0
 */
public class CalcuiatorStaticProxy implements Calculator{

    //被代理目标对象传递过来
    private Calculator calculator;

    public CalcuiatorStaticProxy(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int add(int i, int j) {
        //输出日志
        System.out.println("[日志] add 方法开始了，参数是：" + i + "," + j);

        //调用目标对象的方法实现核心业务
        int addResult = calculator.add(i, j);

        System.out.println("[日志] add 方法结束了，结果是：" + addResult);
        return addResult;
    }

    @Override
    public int sub(int i, int j) {
        return 0;
    }

    @Override
    public int mul(int i, int j) {
        return 0;
    }

    @Override
    public int div(int i, int j) {
        return 0;
    }
}
