package com.edureka.di.module2.autowire.componentscanning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComponentScanDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Student1 student = context.getBean("student1",Student1.class);
        System.out.println(student.getHostel().getName());
    }
}