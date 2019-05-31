package com.rays.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackageClasses= {com.rays.repository.PackageInfo.class})
public class DatabaseConfig {
    
    @Bean
    public DataSource datasource(
            @Value("${datasource.mysql.url}")      String url,
            @Value("${datasource.mysql.username}") String username,
            @Value("${datasource.mysql.password}") String password
            ) {
        
        DriverManagerDataSource ds = new DriverManagerDataSource();
        
        ds.setDriverClassName("org.mariadb.jdbc.Driver");
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);
        
        return ds;
    }
    
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource ds) {
        return new JdbcTemplate(ds);
    }
    
}
