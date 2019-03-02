package com.edureka.di.module2.autowire.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Course {

    private int courseId;
    private String courseName;

    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @PostConstruct
    public void initialize(){
        System.out.println("Came inside the init method");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Came inside the destroy method..");
    }
}
