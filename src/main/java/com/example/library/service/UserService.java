package com.example.library.service;

import com.example.library.entitiy.User;

import java.util.List;

public interface UserService {
    void createUser(User user);
    User getUserByLogin(String login);
    List<User> getAllUsers();
}
