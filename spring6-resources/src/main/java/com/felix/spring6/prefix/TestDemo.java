package com.felix.spring6.prefix;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:TestDemo
 * Package:com.felix.spring6.prefix
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/24 10:23
 * @Version 1.0
 */
public class TestDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:bean.xml");

    }
}
