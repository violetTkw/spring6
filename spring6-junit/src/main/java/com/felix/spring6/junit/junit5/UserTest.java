package com.felix.spring6.junit.junit5;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * ClassName:UserTest
 * Package:com.felix.spring6.junit.junit5
 * Description:spring整合junit5
 *
 * @Author FelixT
 * @Create 2023/3/22 17:56
 * @Version 1.0
 */

@SpringJUnitConfig(locations = "classpath:bean.xml")
public class UserTest {

    //注入
    @Autowired
    private User user;

    //测试方法
    @Test
    public void test(){
        System.out.println(user);
        user.run();
    }
}
