package siorsys.service;

import siorsys.model.User;

public interface UserService {
    void createUser(User user);
    User getUserById(int id);
    User getUserByLogin(String login);
}
