package com.rays.dao.mybatisdao;

import java.util.List;

import com.rays.dao.QuestionDao;
import com.rays.entity.Question;

public class QuestionDaoImpl implements QuestionDao {

    @Override
    public List<Question> queryList(int count) {
        return null;
    }

    @Override
    public Question querySingle(Long id) {
        return null;
    }

    @Override
    public boolean add(Question question) {
        return false;
    }

    @Override
    public void update(Question question) {

    }

}
