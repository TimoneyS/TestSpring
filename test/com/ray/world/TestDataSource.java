package com.ray.world;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=com.ray.world.WorldConfig.class)
public class TestDataSource {
    
    @Autowired
    BasicDataSource ds;
    
    @Test
    public void datasourceNotNull() {
        Assert.assertNotNull(ds);
    }
    
    @Test
    public void datasourceOperate() throws SQLException {
        Connection conn = ds.getConnection();
            
        Statement st = conn.createStatement();
        
        ResultSet rs = st.executeQuery("select count(*) from dog");
        rs.next();
        Assert.assertNotNull(rs.getString(1));
    }
    
    @After
    public void close() {
        try {
            ds.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
