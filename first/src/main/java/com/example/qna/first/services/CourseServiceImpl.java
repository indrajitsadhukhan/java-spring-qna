package com.example.qna.first.services;

import java.util.ArrayList;
import java.util.List;

import com.example.qna.first.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

    List<Course> list;
    public CourseServiceImpl(){
        list = new ArrayList<>();
        list.add(new Course(1,"A","A"));
    }

    @Override
    public List<Course> getCourses() {
        return list;
    }
    
    @Override
    public void addCourse() {
        list.add(course);
    }

    @Override
    public void removeCourse(Course course) 
    {
        int ind=-1;
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)==course)
            ind=i;
        }
        if(ind!=-1)
            list.remove(ind);
    }
    
}
