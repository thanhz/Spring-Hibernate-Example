package com.demo.dao;

import java.util.List;
import com.demo.model.Person;

public interface PersonDAO {

    public void save(Person p);

    public List<Person> list();

}

