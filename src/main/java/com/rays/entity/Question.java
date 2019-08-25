package com.rays.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Question  implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 2912641860336054012L;
    private Long        id;
    private String      title;
    private String      content;
    private List<Reply> replys;
    private Author      author;
    private Date        createDate;

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
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Reply> getReplys() {
        return replys;
    }

    public void setReplys(List<Reply> replys) {
        this.replys = replys;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
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

        sb.append("\nQuestion ").append(id).append(" : ").append(title).append('\n')
                .append(content).append("\n")
                .append("创建时间：").append(createDate).append('\n')
                .append("作者：").append(author).append("\n")
                .append("-----------------------------------------------------\n");

        if (replys != null) {
            for (Reply a : replys) {
                sb.append(a).append('\n');
            }
        }
        return sb.toString();
    }

}
