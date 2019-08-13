package com.rays.dao;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rays.entity.Question;

public interface QuestionDao {
    
    public List<Question> queryList(int count);
    
    @Cacheable(value="questionCache")
    public Question querySingle(Long id);
    
    @Transactional(isolation=Isolation.DEFAULT, propagation=Propagation.REQUIRED)
    public boolean add(Question question);
    
    @Transactional(isolation=Isolation.DEFAULT, propagation=Propagation.REQUIRED)
    public void update(Question question);
    
}
