package com.rays.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rays.config.RootConfig;
import com.rays.entity.Question;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
public class TestQuestionRepository {

    @Autowired
    QuestionRepository questionRepository;
    
    @Test
    public void testSelectSingleQuestion() {
        
        questionRepository.selectSingleQuestion(123L);
        
        for (int i = 0; i < 5; i++) {
            System.out.println("============== Test " + i + " ==========");
            Question q = questionRepository.selectSingleQuestion(123L);
            System.out.println(q);
            Assert.assertNotNull(q);
        }
        
    }
    
    public void testSelectQuestion() {
        
        questionRepository.selectQuestion(2, 2);
        
    }
    
}
