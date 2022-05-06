package com.younghwani.practice.dto;

import com.younghwani.practice.entity.Post;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostDto {
    private String userId;
    private String title;
    private String context;

    public Post toEntity() {
        return Post.builder()
                .userId(userId)
                .title(title)
                .context(context)
                .date(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초")))
                .build();
    }
}
