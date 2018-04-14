package com.studio_projektowe.communicator.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table (name = "Conversation")
public class Conversation {
    @Id
    @GeneratedValue
    Integer id;

    @JsonIgnore
    String password;

    String user_id; //conversation owner's id


    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "Usr_Con",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "conversation_id")}
    )

    Set<AppUser> appUsers = new HashSet<>();

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "Post_con",
            joinColumns = {@JoinColumn(name = "message_id")},
            inverseJoinColumns = {@JoinColumn(name = "conversation_id")}
    )

    Set<Post> posts = new HashSet<>();


    public Conversation() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    @JsonIgnore
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public Set<AppUser> getUsers() {
        return appUsers;
    }

    public void setUsers(Set<AppUser> appUsers) {
        this.appUsers = appUsers;
    }

    public Set<Post> getPosts() {
        return posts;
    }

    public void setPosts(Set<Post> posts) {
        this.posts = posts;
    }
}
