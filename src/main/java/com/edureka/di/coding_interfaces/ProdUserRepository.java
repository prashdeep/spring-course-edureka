package com.edureka.di.coding_interfaces;

import java.util.List;

public class ProdUserRepository implements UserRepository {
    public List<User> getAllUsers() {
        System.out.println("Inside the getAllUsers method of ProdUserRepository");
        return null;
    }

    public void saveUser(User user) {

    }

    public User getUserById(int id) {
        return null;
    }

    public void deleteUser(int id) {

    }
}