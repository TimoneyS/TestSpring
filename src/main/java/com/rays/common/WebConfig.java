package com.rays.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.rays.controller.PackageInfo;

@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses= {PackageInfo.class})
public class WebConfig extends WebMvcConfigurerAdapter {
    
    // JSP 视图解析器
    @Bean
    public InternalResourceViewResolver internalResourceViewResolver() {
        InternalResourceViewResolver res = new InternalResourceViewResolver();
        res.setPrefix("/views/");
        res.setSuffix(".jsp");
        res.setExposeContextBeansAsAttributes(true);
        return res;
    }
    
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
    
    
    
}
