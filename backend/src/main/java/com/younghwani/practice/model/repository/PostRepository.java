package com.younghwani.practice.model.repository;

import com.younghwani.practice.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Integer> {
    List<Post> findByUserId(String userId);
    List<Post> findByTitle(String title);
}