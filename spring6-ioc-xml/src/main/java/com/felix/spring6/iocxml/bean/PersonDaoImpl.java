package com.felix.spring6.iocxml.bean;

/**
 * ClassName:PersonDaoImpl
 * Package:com.felix.spring6.iocxml.bean
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/20 9:21
 * @Version 1.0
 */
public class PersonDaoImpl implements UserDao{
    @Override
    public void run() {
        System.out.println("person run...");
    }
}
