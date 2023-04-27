package com.felix.spring6;

/**
 * ClassName:User
 * Package:com.felix.spring6
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/19 16:41
 * @Version 1.0
 */
public class User {
    public User() {
        System.out.println("无参构造器");
    }

    public void add(){
        System.out.println("add......");
    }

    public static void main(String[] args) {
        User user = new User();
    }
}
