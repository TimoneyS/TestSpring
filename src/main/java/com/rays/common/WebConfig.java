package com.rays.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc // 启用Spring MVC
@ComponentScan(basePackageClasses= {com.rays.controller.PackageInfo.class})
public class WebConfig extends WebMvcConfigurerAdapter {
    
    @Bean
    public InternalResourceViewResolver internalResourceViewResolver() { // JSP 视图解析器
        InternalResourceViewResolver res = new InternalResourceViewResolver();
        res.setPrefix("/views/");
        res.setSuffix(".jsp");
        res.setExposeContextBeansAsAttributes(true);
        return res;
    }
    
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        // 将静态资源的请求转发到其他的Servlet来处理
        configurer.enable();
    }
    
}
