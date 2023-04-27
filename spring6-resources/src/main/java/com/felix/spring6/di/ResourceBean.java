package com.felix.spring6.di;


import org.springframework.core.io.Resource;

/**
 * ClassName:ResourceBean
 * Package:com.felix.spring6.di
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/24 10:09
 * @Version 1.0
 */
public class ResourceBean {

    private Resource resource;

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public void parse(){
        System.out.println(resource.getFilename());
        System.out.println(resource.getDescription());
    }
}
