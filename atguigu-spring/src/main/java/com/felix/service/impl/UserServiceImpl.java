package com.felix.service.impl;

import com.felix.annotation.Bean;
import com.felix.annotation.Di;
import com.felix.dao.UserDao;
import com.felix.service.UserService;

/**
 * ClassName:UserServiceImpl
 * Package:com.felix.service.impl
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/22 8:47
 * @Version 1.0
 */
@Bean
public class UserServiceImpl implements UserService {

    @Di
    private UserDao userDao;

    @Override
    public void add() {
        System.out.println("service...");
        userDao.add();
    }
}
