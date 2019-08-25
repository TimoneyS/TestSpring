package com.rays.dao.mapper;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import com.rays.entity.Question;

@Mapper()
public interface QuestionMapper {

    @Select("select * from question where id = #{id}")
    @Results({
        @Result(column="create_date", property="createDate"),
        @Result(property="author", column="author_id", 
                one=@One(fetchType=FetchType.LAZY, select="com.rays.dao.mapper.AuthorMapper.selectOne")),
        @Result(property="replys", column="id",
                many=@Many(fetchType=FetchType.LAZY, select="com.rays.dao.mapper.ReplyMapper.selectByQ")
                )
    })
    public Question selectOne(long id);
    
}
