package com.rays.dao.springdao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Component;

import com.rays.common.Log;
import com.rays.dao.QuestionDao;
import com.rays.entity.Question;

@Component
public class QuestionDaoImpl implements QuestionDao {

    private String QUERY_QUESTION_BY_ID = "select * from question where question_id = ?";
    private String QUERY_QUESTION       = "select * from question";
    private String INSERT_QUESTION      = "insert into question ( question_id, question_title, question_content, author_id, create_date)"
            + " values ( ?, ?, ?, ?, ? )";
    private String UPDATE_QUESTION      = "update question set "
            + "question_title = ?,"
            + "question_content = ?"
            + "where question_id = ?";
    
    @Autowired
    JdbcOperations jdbcOpt;
    
    public QuestionDaoImpl() {
        Log.p("init QuestionRepositoryImpl");
    }
    
    @Override
    public List<Question> queryList(int count) {
        
        List<Question> list = jdbcOpt.queryForList(QUERY_QUESTION, Question.class);
        
        return list;
    }

    @Override
    public Question querySingle(Long id) {
        Question q = jdbcOpt.queryForObject(QUERY_QUESTION_BY_ID, this::mapRow11, id);
        return q;
    }
    
    public Question mapRow11(ResultSet rs, int arg1) throws SQLException {
        Question q = new Question();
        q.setId(rs.getLong("question_id"));
        q.setTitle(rs.getString("question_title"));
        q.setContent(rs.getString("question_content"));
        q.setCreateDate(rs.getDate("create_date"));
        q.setAuthorId(rs.getLong("author_id"));
        return q;
    }
    
    @Override
    public void update(Question question) {
        jdbcOpt.update(UPDATE_QUESTION, 
                question.getTitle(),
                question.getContent(),
                question.getId()
                );
    }

    @Override
    public boolean add(Question question) {
        jdbcOpt.update(INSERT_QUESTION, 
                question.getId(),
                question.getTitle(),
                question.getContent(),
                question.getAuthorId(),
                question.getCreateDate()
                );
        return true;
    }



}
