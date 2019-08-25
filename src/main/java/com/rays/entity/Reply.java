package com.rays.entity;

import java.io.Serializable;
import java.util.Date;

public class Reply implements Serializable  {

    /**
     * 
     */
    private static final long serialVersionUID = -8976933883843464595L;
    private Long   id;
    private Long   authorId;
    private String content;
    private Date   createDate;

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

        StringBuilder sb = new StringBuilder();

        sb.append("回复 ").append(id).append(":").append(content).append("\n");
        sb.append("创建时间：").append(createDate).append("，作者：").append(authorId).append("\n");
        sb.append("====\n");
        return sb.toString();
    }

}
