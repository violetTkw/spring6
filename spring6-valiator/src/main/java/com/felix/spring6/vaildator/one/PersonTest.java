package com.felix.spring6.vaildator.one;

import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;

/**
 * ClassName:PersonTest
 * Package:com.felix.spring6.vaildator.one
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/24 11:23
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        //创建Person对象
        Person person = new Person();

        //创建person对应databinder
        DataBinder binder=new DataBinder(person);

        //设置校验器
        binder.setValidator(new PersonValidator());

        //调用方法执行校验
        binder.validate();
        //输出检验结果
        BindingResult bindingResult = binder.getBindingResult();
        System.out.println(bindingResult.getAllErrors());
    }
}
