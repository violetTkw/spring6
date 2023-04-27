package com.felix.spring6.iocxml.factoryBean;

import com.felix.spring6.iocxml.lifecycle.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:UserTest
 * Package:com.felix.spring6.iocxml.factoryBean
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/21 11:42
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-factorybean.xml");
        User user = (User) context.getBean("user");
        System.out.println(user);
    }
}
