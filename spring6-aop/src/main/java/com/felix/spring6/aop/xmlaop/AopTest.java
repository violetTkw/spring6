package com.felix.spring6.aop.xmlaop;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:AopTest
 * Package:com.felix.spring6.aop.annoaop
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/22 15:29
 * @Version 1.0
 */
public class AopTest {
    @Test
    public void test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("beanaop.xml");
        Calculator calculator;
        calculator = context.getBean(Calculator.class);
        calculator.add(1,5);
    }
}
