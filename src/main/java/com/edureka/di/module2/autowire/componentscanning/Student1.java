package com.edureka.di.module2.autowire.componentscanning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student1 {

    private String name;

    @Autowired
    private Hostel hostel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hostel getHostel() {
        return hostel;
    }

    public void setHostel(Hostel hostel) {
        this.hostel = hostel;
    }
}