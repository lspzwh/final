package com.example.demo1.entity;
import java.sql.Timestamp;

public class Card {
    private String content;
    private String username;
    public Timestamp time;
    public String title;
    int id;
    public Card(String content, String username, Timestamp time, String title) {
        this.content = content;
        this.username = username;
        this.time = time;
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public String getUsername() {
        return username;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
