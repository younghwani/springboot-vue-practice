package com.younghwani.practice.model.service;

import com.younghwani.practice.entity.Post;

import java.util.List;
import java.util.Optional;

public interface PostService {
    Optional<Post> findOne(int no);
    List<Post> findAll();
    List<Post> findByUserId(String userId);
    List<Post> findByUserTitle(String title);
}
