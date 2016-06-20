package siorsys.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

public abstract class AbstractDao<PK extends Serializable, T> {

    @Autowired
    SessionFactory sessionFactory;

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public void persist(T entity) {
        getSession().persist(entity);
    }

    public void delete(T entity) {
        getSession().delete(entity);
    }

    public T getByRestriction(String restriction, Object restrictionValue, Class objectClass) {
        List<T> list = getSession().createCriteria(objectClass)
                .add(Restrictions.eq(restriction, restrictionValue))
                .list();
        if (list.size() != 0) return list.get(0);
        else return null;
    }

    public List<T> getAll(Class objectClass) {
        return getSession().createCriteria(objectClass).list();
    }
}
