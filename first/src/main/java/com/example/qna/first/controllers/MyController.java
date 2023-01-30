package com.example.qna.first.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.qna.first.entities.Course;
import com.example.qna.first.services.CourseService;

@RestController
public class MyController {

    @Autowired
    private CourseService courseService;
    
    @GetMapping("/home")
    public String home(){
        return "Home!!";
    }

    // Get the list of courses
    @GetMapping("/courses")
    public List<Course> getCourses(){
        courseService.getCourses();
    }

    // Add a new course
    @PostMapping("/courses/add")
    public void addCourse(Course course){
        courseService.addCourse(course);
    }

    // Remove a course
    @DeleteMapping("/courses/remove")
    public void removeCourse(Course course){
        courseService.removeCourse(course);
    }

}
