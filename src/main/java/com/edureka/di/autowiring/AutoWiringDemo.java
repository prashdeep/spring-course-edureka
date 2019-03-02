package com.edureka.di.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWiringDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Department hrDepartment = context.getBean("department", Department.class);
        System.out.println(hrDepartment.getEmployee().getName());
    }
}