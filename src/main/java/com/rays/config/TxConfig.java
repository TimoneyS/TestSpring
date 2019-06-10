package com.rays.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class TxConfig {

    
    public PlatformTransactionManager txManager(DataSource ds) {
        DataSourceTransactionManager man = new DataSourceTransactionManager();
        man.setDataSource(ds);
        return man;
    }
    
}
