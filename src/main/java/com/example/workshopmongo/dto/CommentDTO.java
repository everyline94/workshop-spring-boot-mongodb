package com.example.workshopmongo.dto;

import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable {

    private String texxt;
    private Date date;
    private AuthorDTO author;

    public CommentDTO() {}

    public CommentDTO(String texxt, Date date, AuthorDTO author) {
        this.texxt = texxt;
        this.date = date;
        this.author = author;
    }

    public String getTexxt() {
        return texxt;
    }

    public void setTexxt(String texxt) {
        this.texxt = texxt;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public AuthorDTO getAuthor() {
        return author;
    }

    public void setAuthor(AuthorDTO author) {
        this.author = author;
    }
}
