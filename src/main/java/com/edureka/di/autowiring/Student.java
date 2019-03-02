package com.edureka.di.autowiring;

public class Student {

    private String name;
    private Hostel hostel;

    public Student(String name){
        this.name = name;
    }

    public void setHostel(Hostel hostel){
        this.hostel = hostel;
    }

    public Hostel getHostel(){
        return this.hostel;
    }

}