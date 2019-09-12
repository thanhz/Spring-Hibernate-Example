package com.demo.main;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.dao.PersonDAO;
import com.demo.model.Person;

public class SpringHibernateMain {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        PersonDAO personDAO = context.getBean(PersonDAO.class);

        Person person = new Person();
        person.setName("Alice"); person.setCountry("United States");

        personDAO.save(person);

        System.out.println("Person::"+person);

        List<Person> list = personDAO.list();

        for(Person p : list){
            System.out.println("Person List::"+p);
        }
        //close resources
        context.close();
    }
}

