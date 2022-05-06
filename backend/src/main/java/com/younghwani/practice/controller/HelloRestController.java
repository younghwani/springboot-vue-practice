package com.younghwani.practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloRestController {
    @GetMapping("/hello")
    public String hello() {
        return "hello~~!";
    }
}
