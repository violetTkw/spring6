package com.felix.spring6.iocxml.bean;

/**
 * ClassName:UserDaoImpl
 * Package:com.felix.spring6.iocxml.bean
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/20 9:12
 * @Version 1.0
 */
public class UserDaoImpl implements UserDao{
    @Override
    public void run() {
        System.out.println("run...");
    }
}
