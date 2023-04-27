package com.felix.spring6.iocxml.ditest;

import java.util.List;

/**
 * ClassName:Department
 * Package:com.felix.spring6.iocxml.ditest
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/20 10:32
 * @Version 1.0
 */
//部门
public class Department {
    //一个部门有很多员工
    private List<Employee> employees;

    private String dName;

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public void info() {
        System.out.println("部门名称:" + dName);
        for (Employee e : employees) {
            System.out.println(e.geteName());
        }
    }
}
