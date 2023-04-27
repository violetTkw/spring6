package com.felix.spring6.vaildator.two;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

/**
 * ClassName:ValidationConfig
 * Package:com.felix.spring6.vaildator.two
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/24 11:44
 * @Version 1.0
 */
@Configuration
@ComponentScan("com.felix.spring6.validator.two")
public class ValidationConfig {
    @Bean
    public MethodValidationPostProcessor validationPostProcessor(){
        return new MethodValidationPostProcessor();
    }
}
