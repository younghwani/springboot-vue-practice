package com.younghwani.practice.model.service;

import com.younghwani.practice.entity.Post;
import com.younghwani.practice.model.repository.PostRepository;
import com.younghwani.practice.model.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    PostRepository postRepository;

    @Override
    public Optional<Post> findOne(int no) {
        return postRepository.findById(no);
    }

    @Override
    public List<Post> findAll() {
        return postRepository.findAll();
    }

    @Override
    public List<Post> findByUserId(String userId) {
        return postRepository.findByUserId(userId);
    }

    @Override
    public List<Post> findByUserTitle(String title) {
        return postRepository.findByTitle(title);
    }
}
