package com.edureka.di.coding_interfaces;

import java.util.List;

public class QAUserRepository implements UserRepository {

    public List<User> getAllUsers() {
        System.out.println("Came inside the QAUserRepository class");
        return null;
    }

    public void saveUser(User user) {
        System.out.println("Came inside the QA saveUser method");
    }

    public User getUserById(int id) {
        return null;
    }

    public void deleteUser(int id) {

    }
}