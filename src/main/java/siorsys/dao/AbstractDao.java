package siorsys.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

public abstract class AbstractDao<PK extends Serializable,T> {
    @Autowired
    SessionFactory sessionFactory;

    protected Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    public void persist(T entity){
        getSession().persist(entity);
    }

    public void delete(T entity){
        getSession().delete(entity);
    }
}
