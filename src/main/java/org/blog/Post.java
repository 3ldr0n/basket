package org.spring;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String writer;
    private String title;
    private String text;

    public Post(Integer id, String title, String text) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.writer = "Edison Neto";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getWriter() {
        return writer;
    }

}
