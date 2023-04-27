package com.felix.spring6.autowired.service;

import com.felix.spring6.autowired.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * ClassName:UserServiceImpl
 * Package:com.felix.spring6.autowired.service
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/21 15:48
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("service....");
        userDao.add();
    }

    //注入dao
//    //第一种方式 属性注入
//    @Autowired //根据类型找到对应对象 完成注入
//    private UserDao userDao;

    //第二种方式 set方法注入
//    private UserDao userDao;
//
//    @Autowired
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }
    //第三种方式 构造方法注入
//    private UserDao userDao;
//
//    @Autowired
//    public UserServiceImpl(UserDao userDao) {
//        this.userDao = userDao;
//    }

    //第四种方式 形参注入
//    private UserDao userDao;
//
//
//    public UserServiceImpl(@Autowired UserDao userDao) {
//        this.userDao = userDao;
//    }
    //最后方式:两个注解,根据名称注入
    @Autowired
    @Qualifier(value = "userRedisDaoImpl")
    private UserDao userDao;
}
