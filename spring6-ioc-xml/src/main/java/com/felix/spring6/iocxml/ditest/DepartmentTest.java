package com.felix.spring6.iocxml.ditest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:DepartmentTest
 * Package:com.felix.spring6.iocxml.ditest
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/20 14:58
 * @Version 1.0
 */
public class DepartmentTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-dilist.xml");

        Department department = context.getBean("department", Department.class);
        department.info();
    }
}
