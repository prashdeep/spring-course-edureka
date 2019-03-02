package com.edureka.di.innerBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireClient {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student.getStudentMapper());
    }
}