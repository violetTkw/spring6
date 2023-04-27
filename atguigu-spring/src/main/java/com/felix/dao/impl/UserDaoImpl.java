package com.felix.dao.impl;

import com.felix.annotation.Bean;
import com.felix.dao.UserDao;

/**
 * ClassName:UserDaoImpl
 * Package:com.felix.dao.impl
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/22 8:48
 * @Version 1.0
 */
@Bean
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("dao add()");
    }
}
