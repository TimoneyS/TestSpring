package com.rays.dao.mapper;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.rays.entity.Question;

public interface QuestionMapper {
    
    @Results({
            @Result(property="createDate", column="create_date"),
            @Result(property="authorId", column="author_id")
    })
    @Select("select * from question where id = #{id}")
    public Question querySingle(Long id);
    
}
