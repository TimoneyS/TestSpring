package com.rays.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import net.sf.ehcache.CacheManager;

@Configuration
@EnableCaching
public class CacheConfig {
    
    @Bean
    public EhCacheCacheManager cacheManager (CacheManager cm) {
        
        System.out.println("加载 cacheManager");
        return new EhCacheCacheManager(cm);
    }
    
    @Bean
    public EhCacheManagerFactoryBean ehcache() {
        EhCacheManagerFactoryBean ecfb = new EhCacheManagerFactoryBean();
        ecfb.setConfigLocation(new ClassPathResource("ehcache.xml"));
        return ecfb;
    }
    
}
