package com.felix.spring6.iocxml.di;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:BookTest
 * Package:com.felix.spring6.iocxml.di
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/20 9:31
 * @Version 1.0
 */
public class BookTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");

        Book book = context.getBean("book", Book.class);
        System.out.println(book);
    }

    @Test
    public void testConstructor(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");

        Book book = context.getBean("bookCon", Book.class);
        System.out.println(book);
    }
}
