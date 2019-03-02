package com.edureka.di.module2.autowire.componentscanning;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Hostel {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Value("V-Block")
    private String name;
}