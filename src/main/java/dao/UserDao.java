package dao;

import model.User;

public interface UserDao {
    User getUser(Long id);
    void addUser(String name, int age, String city);
    void removeUser(Long id);
}
