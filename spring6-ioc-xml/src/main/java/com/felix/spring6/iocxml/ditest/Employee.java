package com.felix.spring6.iocxml.ditest;

import java.util.Arrays;

/**
 * ClassName:Employee
 * Package:com.felix.spring6.iocxml.ditest
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/20 10:32
 * @Version 1.0
 */
//员工
public class Employee {

    //员工属于某个部门
    private Department department;

    private String eName;
    private Integer age;

    private String[] hobbies;

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void work() {
        System.out.println(eName + " emp work.. " + age);
        department.info();
        System.out.println(Arrays.toString(hobbies));
    }
}
