package com.edureka.di.module2.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Employee {

    @Value("Ram")
    private String name;


    public Employee(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


}