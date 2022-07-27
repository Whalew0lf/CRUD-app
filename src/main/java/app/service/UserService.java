package app.service;

import app.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void addUser(String name, int age, String city);
    void removeUser(Long id);
}
