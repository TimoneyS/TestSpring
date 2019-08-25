package com.rays.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rays.config.RootConfig;
import com.rays.entity.Question;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
public class TestQuestionDao {

    @Autowired
    QuestionDao questionDao;
    
    @Test
    public void testQuerySingle() {
        Question question = questionDao.querySingle(1L);
        System.out.println(question);
    }
    
}
