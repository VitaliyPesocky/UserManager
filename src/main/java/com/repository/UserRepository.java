package com.repository;

import com.model.User;

import java.util.List;

public interface UserRepository {
    void addUser(User user);

    User getUser(Integer id);

    List<User> getAllUsers();

    void removeUser(Integer id);

    void updateUser(User user);
}
