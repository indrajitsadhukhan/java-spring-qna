package com.example.qna.first.services;

import java.util.ArrayList;
import java.util.List;

import com.example.qna.first.entities.Course;

public class CourseServiceImpl implements CourseService {

    List<Course> list;
    public CourseServiceImpl(){
        list = new ArrayList<>();
        list.add(new Course(1,"A","A"));
    }

    @Override
    public List<Course> getCourses() {
        // TODO Auto-generated method stub
        return list;
    }
    
    
}
