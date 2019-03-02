package com.edureka.di.module2.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Department {

    private String departmentName;
    private String location;

    private Employee employee;

    public Department(String name, String location){
        this.departmentName = name;
        this.location = location;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Employee getEmployee() {
        return employee;
    }

    @Autowired(required = false)
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}