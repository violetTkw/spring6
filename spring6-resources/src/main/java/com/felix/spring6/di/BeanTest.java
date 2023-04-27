package com.felix.spring6.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:BeanTest
 * Package:com.felix.spring6.di
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/24 10:14
 * @Version 1.0
 */
public class BeanTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        ResourceBean bean = context.getBean(ResourceBean.class);
        bean.parse();
    }
}

