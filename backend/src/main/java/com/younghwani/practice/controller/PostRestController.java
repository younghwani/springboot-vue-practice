package com.younghwani.practice.controller;

import com.younghwani.practice.entity.Post;
import com.younghwani.practice.model.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/post")
public class PostRestController {
    @Autowired
    PostService postService;

    @GetMapping("/posts")
    public List<Post> getPosts() {
        return postService.findAll();
    }
}
