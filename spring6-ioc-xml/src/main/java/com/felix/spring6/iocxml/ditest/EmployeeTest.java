package com.felix.spring6.iocxml.ditest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:EmployeeTest
 * Package:com.felix.spring6.iocxml.ditest
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/20 10:56
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-diarray.xml");

        //员工
        Employee employee = context.getBean("employee", Employee.class);
        employee.work();
    }
}
