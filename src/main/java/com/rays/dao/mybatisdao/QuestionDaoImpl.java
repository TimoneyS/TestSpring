package com.rays.dao.mybatisdao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rays.dao.QuestionDao;
import com.rays.dao.mapper.QuestionMapper;
import com.rays.entity.Question;

@Repository
public class QuestionDaoImpl implements QuestionDao {
    
    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Override
    public List<Question> queryList(int count) {
        return null;
    }

    @Override
    public Question querySingle(Long id) {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            QuestionMapper mapper = session.getMapper(QuestionMapper.class);
            return mapper.selectOne(id);
        }
    }

    @Override
    public boolean add(Question question) {
        return false;
    }

    @Override
    public void update(Question question) {

    }

}
