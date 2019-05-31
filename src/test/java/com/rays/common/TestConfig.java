package com.rays.common;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.DataSource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rays.config.RootConfig;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
public class TestConfig {

    @Autowired
    ApplicationContext ctx;
    
    @Autowired
    DataSource ds;
    
    @Test
    public void testDataSource() throws Exception {
        Connection conn = ds.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select 123");
        rs.next();
        Assert.assertEquals(123, rs.getInt(1));
    }
    
}
