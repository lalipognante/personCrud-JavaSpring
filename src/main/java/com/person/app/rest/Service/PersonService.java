package com.person.app.rest.Service;

import com.person.app.rest.Entity.Person;

import java.util.List;

// Crar métodos para hacer consultas
public interface PersonService {

    public List<Person> consultPersons();

    public Person createPerson(Person person);

    public Person modifyPerson(Person person);

    public Person searchPerson(int id);

    public void deletePerson(int id);

}
