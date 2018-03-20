package com.ray.world;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.ray.world.manager.CatManager;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan()
public class WorldConfig {
    
    @Bean
    public CatManager catManager() {
        return new CatManager();
    }
    
}
