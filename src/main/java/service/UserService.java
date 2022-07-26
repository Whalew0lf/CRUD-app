package service;

import model.User;

public interface UserService {
    User getUser(Long id);
    void addUser(String name, int age, String city);
    void removeUser(Long id);
}
