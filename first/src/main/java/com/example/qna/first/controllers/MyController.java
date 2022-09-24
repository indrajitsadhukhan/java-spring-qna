package com.example.qna.first.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.qna.first.entities.Course;

@RestController
public class MyController {
    @GetMapping("/home")
    public String home(){
        return "Home!!";
    }
    // Get the list of courses
    public List<Course> getCourses(){
        
    }
}
