package com.rays.config;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.core.io.ClassPathResource;

import com.rays.common.Log;
import com.rays.entity.old.Cat;

@Configuration
@EnableAspectJAutoProxy
@Import(value= { DatabaseConfig.class, SecurityConfig.class, CacheConfig.class, TxConfig.class})
public class RootConfig {
    
    @Bean
    public PropertyPlaceholderConfigurer propertyPlaceholderConfigurer() {
        
        PropertyPlaceholderConfigurer ppc = new PropertyPlaceholderConfigurer();
        
        ppc.setLocations(
                new ClassPathResource("datasource.properties")
                );
        
        return ppc;
    }
    
    @Bean
    public Cat cat() {
        Log.p("加载Root config Cat");
        return new Cat();
    }
    
}
