package com.rays.common;

import org.springframework.context.support.ReloadableResourceBundleMessageSource;

import com.ray.io.Out;

public class TestAll {

    public static void main(String[] args) {
        
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        
        messageSource.setBasename("classpath:message");
        messageSource.setCacheSeconds(10);
        
        Out.p(messageSource.getMessage("home.title", null, null));
        
    }
    
}
