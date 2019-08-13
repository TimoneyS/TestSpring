package com.rays.entity;

import java.util.Date;

public class Question {

    private Long   id;
    private Long   authorId;
    private String title;
    private String content;
    private Date   createDate;

    public Question() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Question:\nid = " + id + "\nauthorId = " + authorId + "\ncreateDate = " + createDate + "\ncontent = "
                + content + "\ntitle = " + title;
    }

}
