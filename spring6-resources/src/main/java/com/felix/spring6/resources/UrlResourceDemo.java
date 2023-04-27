package com.felix.spring6.resources;

import org.springframework.core.io.UrlResource;

import java.net.MalformedURLException;

/**
 * ClassName:UrlResourceDemo
 * Package:com.felix.spring6.resources
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/23 18:24
 * @Version 1.0
 */
//通过UrlResource访问网络资源
public class UrlResourceDemo {

    public static void main(String[] args) {
        //http前缀
        loadUrlResource("http://www.baidu.com");

        //file前缀
        loadUrlResource("file:felix.txt");
    }

    //让问前缀http file
    public static void loadUrlResource(String path) {
        try {
            //获得Resource实现类的对象 UrlResource
            UrlResource urlResource = new UrlResource(path);

            //获取资源信息
            System.out.println(urlResource.getFilename());
            System.out.println(urlResource.getURL());
            System.out.println(urlResource.getDescription());
            System.out.println(urlResource.getInputStream().read());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
