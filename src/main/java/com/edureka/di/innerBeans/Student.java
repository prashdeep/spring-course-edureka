package com.edureka.di.innerBeans;

import lombok.Data;

import java.sql.ResultSet;

@Data
public class Student {

    private int id;
    private String name;
    private int grade;

    public Student(){
    }

    private StudentMapper studentMapper;

    public Student(int id, String name, int grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

     static class StudentMapper {

        StudentMapper(){}

        public Student map(ResultSet rs){
            return new Student(12,"Vinay", 34);
        }
    }
}

