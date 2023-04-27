package com.felix.spring6.iocxml.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:UserDaoTest
 * Package:com.felix.spring6.iocxml.bean
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/20 9:14
 * @Version 1.0
 */
public class UserDaoTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        //根据类型获取接口对应bean
        UserDao userDao = context.getBean(UserDao.class);
        System.out.println(userDao);
        userDao.run();
    }

}
