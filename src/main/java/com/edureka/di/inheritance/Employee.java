package com.edureka.di.inheritance;

import lombok.Data;

@Data
public abstract class Employee {
    private final int age;
    private final String name;
    private final int id;
}