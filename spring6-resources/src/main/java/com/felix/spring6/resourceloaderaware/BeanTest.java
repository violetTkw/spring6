package com.felix.spring6.resourceloaderaware;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;

/**
 * ClassName:BeanTest
 * Package:com.felix.spring6.resourceloaderaware
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/24 9:47
 * @Version 1.0
 */
public class BeanTest implements ResourceLoaderAware {

    private ResourceLoader resourceLoader;

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader=resourceLoader;
    }

    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}
