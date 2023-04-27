package com.felix.spring6.resourceloaderaware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ResourceLoader;

/**
 * ClassName:DemoTest
 * Package:com.felix.spring6.resourceloaderaware
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/24 9:50
 * @Version 1.0
 */
public class DemoTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BeanTest testBean = context.getBean("testBean", BeanTest.class);
        ResourceLoader resourceLoad=testBean.getResourceLoader();
        System.out.println(context==resourceLoad);
    }
}
