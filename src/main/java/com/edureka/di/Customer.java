package com.edureka.di;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.util.Map;
import java.util.Set;
import java.util.List;

public class Customer {

    private Driver driver;
    private int age;
    private String name;
    private Set<String> nickNames;
    private List<Address> addressList;
    private Map<Integer, Address> addressMap;

    public Map<Integer, Address> getAddressMap() {
        return addressMap;
    }

    public void setAddressMap(Map<Integer, Address> addressMap) {
        this.addressMap = addressMap;
    }

    public Customer(String name){
        this.name = name;
        System.out.println("The constructor of CUstomer is invoked ....");
    }

    public void commute(){
        this.driver.commute();
    }

    public void setDriver(Driver driver){
        System.out.println("The setter method of CUstomer is invoked .... with set Driver");
        this.driver = driver;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void initialize() {
        System.out.println("My custom initialization method for this bean...");
    }

    private void cleanUp() {
        System.out.println("Cleaning up of resources in the destroy method....");
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public Set<String> getNickNames() {
        return nickNames;
    }

    public void setNickNames(Set<String> nickNames) {
        this.nickNames = nickNames;
    }

    //init methods
    public void destroy() throws Exception {

    }
    //init methods
    public void afterPropertiesSet() throws Exception {

    }
}