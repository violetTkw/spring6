package com.felix.spring6.vaildator.two;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

/**
 * ClassName:User
 * Package:com.felix.spring6.vaildator.two
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/24 14:11
 * @Version 1.0
 */
public class User {

    @NotNull
    private String name;

    @Min(0)
    private int age;

}
