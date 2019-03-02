package com.edureka.di.javaconfig;

import com.edureka.di.autowiring.Hostel;
import com.edureka.di.autowiring.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Student student(){
        Student student  =  new Student("Vinay");
        student.setHostel(hostel());
        return student;
    }

    @Bean
    public Hostel hostel(){
        return new Hostel(23,"V-Block");
    }
}