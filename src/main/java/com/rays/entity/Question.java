package com.rays.entity;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.ray.io.Out;

public class Question {

    Long   id;
    @NotNull
    @Size(min=4, max=10)
    String title;
    String describle;
    Date   createDate;
    
    public Question() {
    }

    public Question(long i, String string, Date date) {
        this.id = i;
        this.title = string;
        this.createDate = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        Out.p("Question set title = " + title);
        this.title = title;
    }

    public String getDescrible() {
        return describle;
    }

    public void setDescrible(String describle) {
        this.describle = describle;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    
    @Override
    public int hashCode() {
        return super.hashCode();
    }

}
