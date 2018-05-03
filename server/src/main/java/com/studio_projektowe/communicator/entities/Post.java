package com.studio_projektowe.communicator.entities;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table (name = "Post")
public class Post {
    @Id
    @GeneratedValue
    Integer id;

    String conversationId;
    String userId;
    String body;
    Date date;


    public Post() {
    }

    public Post(String conversationId, String userId, String postBody, Date postDate){
        this.conversationId = conversationId;
        this.userId = userId;
        this.body = postBody;
        this.date = postDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\":\"" + id + '\"' +
                ",\"body\":\"" + body + '\"' +
                ",\"userId\":\"" + userId + '\"' +
                ",\"date\":\"" + date + "\"" +
                '}';
    }
}