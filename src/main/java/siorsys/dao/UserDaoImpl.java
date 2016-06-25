package siorsys.dao;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import siorsys.model.User;

import java.util.List;

@Repository("userDao")
public class UserDaoImpl extends AbstractDao implements UserDao {

    @Override
    public void save(User user) {
        persist(user);
    }

    @Override
    public void delete(User user) {
        delete(user);
    }

    @Override
    public void update(User user) {
        persist(user);
    }

    @Transactional
    public User getUserById(int id) {
        return (User) getByRestriction("id",id,User.class).get(0);
    }

    @Transactional
    public User getUserByLogin(String login) {
         return (User) getByRestriction("login",login,User.class).get(0);
    }

    @Transactional
    public List<User> getAllUsers(){
        return getAll(User.class);
    }

}
