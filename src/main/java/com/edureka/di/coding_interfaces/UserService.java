package com.edureka.di.coding_interfaces;

import java.util.List;

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> fetchAllUsers(){
        return this.userRepository.getAllUsers();
    }
}