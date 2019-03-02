package com.edureka.di.coding_interfaces;

import java.util.List;

public interface UserRepository {

    public List<User> getAllUsers();

    public void saveUser(User user);

    public User getUserById(int id);

    public void deleteUser(int id);
}