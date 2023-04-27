package com.felix.spring6.resources;

import org.springframework.core.io.FileSystemResource;

import java.io.IOException;
import java.io.InputStream;

/**
 * ClassName:FileSystemResourceDemo
 * Package:com.felix.spring6.resources
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/24 9:31
 * @Version 1.0
 */
public class FileSystemResourceDemo {

    public static void loadFilePathResource(String path){
        //创建对象FileSystemResource
        FileSystemResource resource = new FileSystemResource(path);

        System.out.println(resource.getFilename());
        System.out.println(resource.getDescription());
        //获取文件内容
        try {
            InputStream in = resource.getInputStream();
            byte[] b=new byte[1024];
            while (in.read(b)!=-1){
                System.out.println(new String(b));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        loadFilePathResource("D:\\felix.txt");
    }
}
