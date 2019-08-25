package com.rays.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.Alias;

import com.rays.entity.Reply;

@Alias("ReplyMapper")
public interface ReplyMapper {
    
    @Select("SELECT * FROM REPLY WHERE QUESTION_ID = #{q_id}")
    public List<Reply> selectByQ(long q_id);
}
