package com.felix.spring6.iocxml.lifecycle;

/**
 * ClassName:User
 * Package:com.felix.spring6.iocxml.lifecycle
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/21 10:41
 * @Version 1.0
 */
public class User {

    private String name;

    public User() {
        System.out.println("1.bean对象创建调用无参构造");
    }

    //初始化方法
    public void initMethod(){
        System.out.println("4. bean对象初始化 调用指定的初始化方法");
    }

    //销毁方法
    public void destroyMethod(){
        System.out.println("7. bean对象的销毁 调用指定的销毁的方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("2. 给bean对象设置属性值");
        this.name = name;
    }
}
