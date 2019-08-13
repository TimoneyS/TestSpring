package com.rays.repository;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rays.config.RootConfig;
import com.rays.dao.QuestionDao;
import com.rays.dao.springdao.SequenceDao;
import com.rays.entity.Question;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
public class TestQuestionRepository {

    @Autowired
    QuestionDao questionDao;
    
    @Autowired
    SequenceDao sequenceDao;
    
    public void testSelectSingleQuestion() {
        
        questionDao.querySingle(123L);
        
        for (int i = 0; i < 5; i++) {
            System.out.println("============== Test " + i + " ==========");
            Question q = questionDao.querySingle(123L);
            System.out.println(q);
            Assert.assertNotNull(q);
        }
        
    }
    
    public void testAddQuestion() {
        Question question = new Question();
        question.setId(sequenceDao.getSequenceNextval("N_QUES_SEQ"));
        question.setAuthorId(10004L);
        question.setTitle("有没有什么好玩的游戏");
        question.setContent("现在游戏荒了，求好玩的游戏啊。");
        question.setCreateDate(new Date());
        questionDao.add(question);
    }
    
    @Test
    public void testUpdateQuestion() {
        
        Question question = questionDao.querySingle(26L);
        
        question.setContent("现在出现游戏荒了，不知道有什么好玩的游戏。");
        
        questionDao.update(question);
        
    }
    
    public void testSelectQuestion() {
        questionDao.queryList(1);
    }
    
}
