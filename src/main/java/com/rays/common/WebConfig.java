package com.rays.common;

import java.util.Arrays;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.mvc.annotation.AnnotationMethodHandlerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
@SuppressWarnings("deprecation")
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
    
    @Bean
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:message");
        messageSource.setCacheSeconds(10);
        return messageSource;
    }
    
    @Bean
    public StringHttpMessageConverter stringHttpMessageConverter() {
        StringHttpMessageConverter convert = new StringHttpMessageConverter();
        convert.setSupportedMediaTypes(Arrays.asList(new MediaType[] {MediaType.parseMediaType("application/json;charset=UTF-8")}));
        return convert;
    }
    
    @Bean
    public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
        MappingJackson2HttpMessageConverter convert = new MappingJackson2HttpMessageConverter();
        
        convert.setSupportedMediaTypes(Arrays.asList(new MediaType[] {MediaType.parseMediaType("application/json;charset=UTF-8")}));
        return convert;
    }
    
    @Bean
    public AnnotationMethodHandlerAdapter annotationMethodHandlerAdapter() {
        AnnotationMethodHandlerAdapter handler = new AnnotationMethodHandlerAdapter();
        
        handler.setMessageConverters(new HttpMessageConverter<?>[] {
            stringHttpMessageConverter(),
            mappingJackson2HttpMessageConverter()
        });
        
        return handler;
    }
    
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        // 将静态资源的请求转发到其他的Servlet来处理
        configurer.enable();
    }
    
    
    
}
