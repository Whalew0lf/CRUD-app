package app.dao;

import app.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    void addUser(String name, int age, String city);
    void removeUser(Long id);
}
