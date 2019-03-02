package com.edureka.di.module2.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWiringDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Department department = context.getBean("autoWireDepartment", Department.class);
        System.out.println(department.getEmployee().getName());
    }
}