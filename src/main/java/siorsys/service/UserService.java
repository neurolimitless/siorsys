package siorsys.service;

import siorsys.model.User;

import java.util.List;

public interface UserService {
    void createUser(User user);
    User getUserById(int id);
    User getUserByLogin(String login);
    List<User> getAllUsers();
}
