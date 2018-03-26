package com.ray.world;

import org.apache.commons.dbcp.BasicDataSource;
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
    
    @Bean
    public BasicDataSource datasource() {
        BasicDataSource  ds = new BasicDataSource();
        
        ds.setDriverClassName("org.mariadb.jdbc.Driver");
        ds.setUrl("jdbc:mariadb://localhost:3306/world");
        ds.setUsername("root");
        ds.setPassword("root");
        
        ds.setInitialSize(5);
        ds.setMaxActive(10);
        
        return ds;
    }

}
