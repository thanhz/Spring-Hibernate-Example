package com.demo.dao;

import com.demo.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class PersonDAOImpl implements PersonDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public void save(Person p) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(p);
    }

    @SuppressWarnings("unchecked")
    @Override
    @Transactional
    public List<Person> list() {
        Session session = this.sessionFactory.getCurrentSession();
        return session.createQuery("from Person").list();
    }

}

