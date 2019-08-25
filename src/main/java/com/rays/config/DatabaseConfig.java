package com.
rays.config;

import javax.sql.DataSource;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

@Configuration
@ComponentScan(basePackageClasses= {com.rays.dao.mybatisdao.PackageInfo.class})
@MapperScan(basePackageClasses=com.rays.dao.mapper.PackageInfo.class)
public class DatabaseConfig {
    
    @Bean
    @Profile("prod")
    public DataSource datasource(
            @Value("${driver}")   String dirver,
            @Value("${url}")      String url,
            @Value("${username}") String username,
            @Value("${password}") String password
            ) {
        PooledDataSource ds = new PooledDataSource();
        ds.setDriver(dirver);
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);
        
        ds.setPoolMaximumActiveConnections(5);
        
        return ds;
    }
    
    @Bean
    @Profile("dev")
    public DataSource embeddedDatasource() {
        System.out.println("创建嵌入式数据源");
        return new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.H2)
                .addScript("classpath:schema.sql")
                .addScript("classpath:test-data.sql")
                .build();
    }
    
    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource ds) throws Exception {
        SqlSessionFactoryBean sfb = new SqlSessionFactoryBean();
        
        sfb.setDataSource(ds);
        
        return sfb.getObject();
    }
    
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource ds) {
        return new JdbcTemplate(ds);
    }
    
}
