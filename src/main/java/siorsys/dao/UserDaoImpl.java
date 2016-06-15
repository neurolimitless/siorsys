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
        List<User> users = getSession().createCriteria(User.class)
                .add(Restrictions.eq("id", id))
                .list();
        if (users.size() != 0)
            return users.get(0);
        else return null;
    }

    @Transactional
    public User getUserByName(String name) {
        List<User> users = getSession().createCriteria(User.class)
                .add(Restrictions.eq("name", name))
                .list();
        if (users.size() != 0)
            return users.get(0);
        else return null;
    }

}
