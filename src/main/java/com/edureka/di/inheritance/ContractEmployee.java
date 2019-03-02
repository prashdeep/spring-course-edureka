package com.edureka.di.inheritance;

import lombok.Data;

@Data
public class ContractEmployee extends Employee {

    private int duration;
    private double pricePerDay;

    public ContractEmployee(int age, String name, int id) {
        super(age, name, id);
    }
}