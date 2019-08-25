package com.rays.dao.springdao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

public class SequenceDao {

    @Autowired
    private JdbcOperations jdbcOpt;
    
    public Long getSequenceNextval(String name) {
        
         SqlRowSet rs = jdbcOpt.queryForRowSet("select nextval('"+name+"') seq");
        
         if(rs.next())
             return rs.getLong("seq");
         else
             throw new RuntimeException("sequence error, name = " + name);
        
    }
    
}
