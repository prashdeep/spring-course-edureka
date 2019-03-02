package com.edureka.di.inheritance;

import lombok.Data;

@Data
public class RegularEmployee extends Employee {

    private int leave;
    private double salary;

    public RegularEmployee(int age, String name, int id) {
        super(age, name, id);
    }
}