package com.rays.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rays.config.RootConfig;
import com.rays.dao.SequenceDao;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
public class TestSequenceRepositiry {

    @Autowired
    SequenceDao repo;
    
    @Test
    public void testSelectSingleQuestion() {
        
        long id = repo.getSequenceNextval("N_QUES_SEQ");
        
        Assert.assertNotNull("123", id);
        
    }
    
    
}
