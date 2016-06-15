package siorsys.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import siorsys.model.User;

import java.util.List;

public interface UserDao {
    void save(User user);

    void delete(User user);

    void update(User user);

    User getUserById(int id);

    User getUserByName(String name);
}
