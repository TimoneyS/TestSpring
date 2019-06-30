package com.rays.repository;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rays.entity.Question;

public interface QuestionRepository {
    
    public List<Question> selectQuestion(long max, int count);
    
    @Cacheable(value="questionCache")
    public Question selectSingleQuestion(Long id);
    
    @Transactional(isolation=Isolation.DEFAULT, propagation=Propagation.REQUIRED)
    public boolean addNewQuestion(Question question);
    
    public void updateQuestion(Question question);
    
}
