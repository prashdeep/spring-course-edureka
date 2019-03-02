package com.edureka.di.autowiring;

public class Hostel {

    private int id;
    private String name;

    public Hostel(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}