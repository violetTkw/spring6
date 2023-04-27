package com.felix.annotation;

import com.felix.bean.AnnotationApplicationContext;
import com.felix.bean.ApplicationContext;
import com.felix.service.UserService;

/**
 * ClassName:UserTest
 * Package:com.felix.annotation
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/22 9:57
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationApplicationContext("com.felix");
        UserService userService = (UserService) context.getBean(UserService.class);
        userService.add();
    }
}
