package app.dao;

import app.model.User;

public interface UserDao {
    User getUser(Long id);
    void addUser(String name, int age, String city);
    void removeUser(Long id);
}
