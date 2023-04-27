package com.felix.spring6;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:UserTest
 * Package:com.felix.spring6
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/19 17:05
 * @Version 1.0
 */
public class UserTest {

    //创建Logger对象
    private Logger logger = LoggerFactory.getLogger(User.class);

    @Test
    public void test() {
        //加载spring配置文件,对象创建
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        //获取创建的对象
        User user = (User) context.getBean("user");
        System.out.println(user);

        //使用对象调用方法进行测试
        user.add();

        //手动写日志
        logger.info("执行调用成功了");
    }
}
