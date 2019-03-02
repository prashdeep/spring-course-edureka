package com.edureka.di.javaconfig;

import com.edureka.di.autowiring.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppConfigClient {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        Student student = context.getBean("student", Student.class);
        System.out.println(student.getHostel().getName());
    }
}