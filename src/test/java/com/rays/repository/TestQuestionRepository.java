package com.rays.repository;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.rays.config.RootConfig;
import com.rays.entity.Question;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
public class TestQuestionRepository {

    @Autowired
    QuestionRepository questionRepository;
    
    @Autowired
    SequenceRepository sequenceDao;
    
    public void testSelectSingleQuestion() {
        
        questionRepository.selectSingleQuestion(123L);
        
        for (int i = 0; i < 5; i++) {
            System.out.println("============== Test " + i + " ==========");
            Question q = questionRepository.selectSingleQuestion(123L);
            System.out.println(q);
            Assert.assertNotNull(q);
        }
        
    }
    
    @Test
    public void testAddQuestion() {
        
        Runnable r = () -> {
            Question question = new Question();
            question.setId(sequenceDao.getSequenceNextval("N_QUES_SEQ"));
            question.setAuthorId(10004L);
            question.setTitle("有没有什么好玩的游戏");
            question.setDescrible("现在游戏荒了，求好玩的游戏啊。");
            question.setCreateDate(new Date());
            questionRepository.addNewQuestion(question);
        };
        
        ExecutorService es = Executors.newFixedThreadPool(2);
        
        es.submit(r);
        es.submit(r);
        
        try {
            es.awaitTermination(15, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("testAddQuestion End");
    }
    
    public void testSelectQuestion() {
        
        questionRepository.selectQuestion(2, 2);
        
    }
    
}
