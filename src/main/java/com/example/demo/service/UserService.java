package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

public interface UserService {
    public void addUser(User user);

    public User getUserById(int id);

    public User updateUser(User user);

    public void removeUserById(int id);

    public List<User> listUsers();
}
