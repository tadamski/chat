package com.studio_projektowe.communicator.controllers;

import com.studio_projektowe.communicator.entities.Post;
import com.studio_projektowe.communicator.repositories.PostRepository;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.GeneratedValue;
import java.util.Date;

@RestController
@RequestMapping(value = "/post", method = RequestMethod.POST)
public class PostController {

    @MessageMapping("/newMessage")
    @SendTo("/topic/newMessage")
    public Post save(Post postEntity){
        Post post = new Post(postEntity.getUserId(), postEntity.getPostBody(), new Date());
        return post;
    }

}
