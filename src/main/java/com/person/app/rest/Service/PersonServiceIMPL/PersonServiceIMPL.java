package com.person.app.rest.Service.PersonServiceIMPL;

import com.person.app.rest.Entity.Person;
import com.person.app.rest.Repository.PersonRepo;
import com.person.app.rest.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//implementamos los métodos de la Interfaz PersonService
@Service
public class PersonServiceIMPL implements PersonService {

    // creamos el objeto Repo
    @Autowired
    private PersonRepo repo;

    @Override
    public List<Person> consultPersons() {
        return (List<Person>)this.repo.findAll();
    }

    @Override
    public Person createPerson(Person person) {
        person.setEmail(person.getEmail());
        return this.repo.save(person);
    }

    @Override
    public Person modifyPerson(Person person) {
        return this.repo.save(person);
    }

    @Override
    public Person searchPerson(int id) {
        return this.repo.findById(id).get();
    }

    @Override
    public void deletePerson(int id) {
        this.repo.deleteById(id);
    }
}
