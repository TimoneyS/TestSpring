package com.rays.repository;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ray.io.Out;
import com.rays.entity.Question;

@Component
public class QuestionRepositoryImpl implements QuestionRepository {

    public QuestionRepositoryImpl() {
        
        Out.p("init QuestionRepositoryImpl");
    }
    
    @Override
    public List<Question> selectQuestion(long max, int count) {
        return null;
    }

    @Override
    public Question selectSingleQuestion(Long id) {
        
        Question q = new Question(id, "Question " + id, new Date());
        
        q.setDescrible("First Question on this app");
        return q;
    }

}
