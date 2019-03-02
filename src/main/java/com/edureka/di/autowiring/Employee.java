package com.edureka.di.autowiring;

public class Employee {

    private final String name;
    private final Department department;

    public Employee(Department department, String name){
        this.department = department;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }
}