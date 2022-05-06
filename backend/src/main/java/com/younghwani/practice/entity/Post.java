package com.younghwani.practice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "post")
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    @Id @Column(name = "no")
    private int no;

    @Column(name = "userId", nullable = false, length = 45)
    private String userId;

    @Column(name = "title", nullable = false, length = 50)
    private String title;

    @Column(name = "context", nullable = true)
    private String context;

    @Column(name = "date", nullable = false, length = 45)
    private String date;
}
