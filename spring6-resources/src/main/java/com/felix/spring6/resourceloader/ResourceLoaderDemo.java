package com.felix.spring6.resourceloader;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.Resource;

/**
 * ClassName:ResourceLoaderDemo
 * Package:com.felix.spring6.resourceloader
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/24 9:40
 * @Version 1.0
 */
public class ResourceLoaderDemo {

    @Test
    public void test(){
        ApplicationContext context=new ClassPathXmlApplicationContext();
        Resource resource = context.getResource("felix.txt");
        System.out.println(resource.getFilename());
    }
    @Test
    public void test1(){
        ApplicationContext context=new FileSystemXmlApplicationContext();
        Resource resource = context.getResource("felix.txt");
        System.out.println(resource.getFilename());
    }
}
