package com.rays.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class WebConfig {
    
//    <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
//    <property name="prefix" value="/views/"/>
//    <property name="suffix" value=".jsp"></property>
//</bean>
    
    @Bean
    public InternalResourceViewResolver internalResourceViewResolver() {
        InternalResourceViewResolver res = new InternalResourceViewResolver();
        res.setPrefix("/views/");
        res.setSuffix(".jsp");
        return res;
    }
    
    
    
    
}
