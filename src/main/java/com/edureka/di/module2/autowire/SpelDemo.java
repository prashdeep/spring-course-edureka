package com.edureka.di.module2.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpelDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Spel spel = context.getBean("spel", Spel.class);
        System.out.println(spel.getValue());
    }
}