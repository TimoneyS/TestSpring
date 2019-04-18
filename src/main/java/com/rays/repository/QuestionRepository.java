package com.rays.repository;

import java.util.List;

import com.rays.entity.Question;

public interface QuestionRepository {
    
    public List<Question> selectQuestion(long max, int count);
    public Question selectSingleQuestion(Long id);
    
}
