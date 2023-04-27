package com.felix.spring6.iocxml.factoryBean;

import org.springframework.beans.factory.FactoryBean;

/**
 * ClassName:MyFactoryBean
 * Package:com.felix.spring6.iocxml.factoryBean
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/21 11:39
 * @Version 1.0
 */
public class MyFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
