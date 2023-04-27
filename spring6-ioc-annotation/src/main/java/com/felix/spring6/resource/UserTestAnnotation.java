package com.felix.spring6.resource;

import com.felix.spring6.config.SpringConfig;
import com.felix.spring6.resource.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:UserTestAnnoation
 * Package:com.felix.spring6.resource
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/21 20:47
 * @Version 1.0
 */
public class UserTestAnnotation {
    public static void main(String[] args) {
        //加载配置类
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        UserController controller = context.getBean(UserController.class);
        controller.add();
    }
}
