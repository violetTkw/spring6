package com.felix.spring6.jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

/**
 * ClassName:JDBCTemplateTest
 * Package:com.felix.spring6.jdbc
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/23 9:39
 * @Version 1.0
 */
@SpringJUnitConfig(locations = "classpath:bean.xml")
public class JdbcTemplateTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    //查询 返回对象
    @Test
    public void testSelectObject() {
        //写法一
//        String sql = "select * from t_emp where id=?";
//        Emp empResult = jdbcTemplate.queryForObject(sql,
//                (rs, rowNum) -> {
//                    Emp emp = new Emp();
//                    emp.setId(rs.getInt("id"));
//                    emp.setName(rs.getString("name"));
//                    emp.setAge(rs.getInt("age"));
//                    emp.setSex(rs.getString("sex"));
//                    return emp;
//                }, 1);
//        System.out.println(empResult);

        //写法二
        String sql = "select * from t_emp where id=?";
        Emp emp = jdbcTemplate.queryForObject(sql,
                new BeanPropertyRowMapper<>(Emp.class), 1);
        System.out.println(emp);
    }

    //查询 返回list集合
    @Test
    public void testSelectList() {
        String sql = "select * from t_emp";
        List<Emp> empList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Emp.class));
        System.out.println(empList);
    }

    //查询 返回单个值
    @Test
    public void testSelectValue() {
        String sql = "select count(*) from t_emp";
        Integer integer = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(integer);
    }

    //添加 修改 删除 操作
    @Test
    public void testCreate() {
        // 1.对数据库的添加操作
        //第一步 添加sql语句
        String sql = "insert into t_emp values(null,?,?,?)";
        //第二部 调用jdbcTemplate的方法，传入相关参数
        int rows = jdbcTemplate.update(sql, "岳不群", 40, "男");
        System.out.println(rows);
    }

    @Test
    public void testUpdate() {
        //修改操作
        //第一步 添加sql语句
        String sql = "update t_emp set name=? where id=?";
        //第二部 调用jdbcTemplate的方法，传入相关参数
        int rows = jdbcTemplate.update(sql, "岳不群kk", 2);
        System.out.println(rows);
    }

    @Test
    public void testDelete() {
        //删除操作
        //第一步 添加sql语句
        String sql = "delete from t_emp where id=?";
        //第二部 调用jdbcTemplate的方法，传入相关参数
        int rows = jdbcTemplate.update(sql, 2);
        System.out.println(rows);
    }
}
