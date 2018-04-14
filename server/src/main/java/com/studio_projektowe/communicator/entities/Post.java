package com.studio_projektowe.communicator.entities;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table (name = "Post")
public class Post {
    @Id
    @GeneratedValue
    Integer id;

    String userId;
    String postBody;
    Date postDate;


    public Post() {
    }

    public Post(String userId, String postBody, Date postDate){
        this.userId = userId;
        this.postBody = postBody;
        this.postDate = postDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPostBody() {
        return postBody;
    }

    public void setPostBody(String postBody) {
        this.postBody = postBody;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\":\"" + id + '\"' +
                ",\"body\":\"" + postBody + '\"' +
                ",\"userId\":\"" + userId + '\"' +
                ",\"date\":\"" + postDate + "\"" +
                '}';
    }
}