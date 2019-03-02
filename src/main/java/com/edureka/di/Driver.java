package com.edureka.di;

public class Driver {

    private String name;



    public Driver(String name){
      //  System.out.println("Called constructor of Driver");
        this.name = name;
    }

    public void commute(){
        System.out.println("Commuting with Uber Driver "+this.name);
    }
}