package com.person.app.rest.Repository;

import com.person.app.rest.Entity.Person;
import org.springframework.data.repository.CrudRepository;

// Hereda los metodos de la Clase CrudRepository
// <Objeto clase para aplicar estos métodos, atributo por el cual se base: Integer el id>
public interface PersonRepo extends CrudRepository<Person, Integer> {

}
