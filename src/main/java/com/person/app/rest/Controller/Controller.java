package com.person.app.rest.Controller;

import com.person.app.rest.Entity.Person;
import com.person.app.rest.Service.PersonServiceIMPL.PersonServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("CrudRepo")
public class Controller {

    // vamos a crear un objeto de tipo PersonServiceImpl
    // vamos a implementar los metodos de esa clase
    // vamos a Reemplazar, agregar logica dentro de esos metodos
    @Autowired
    private PersonServiceIMPL impl;

    @GetMapping
    @RequestMapping(value = "consultPersons", method = RequestMethod.GET)
    public ResponseEntity<?> consultPersons(){
        List<Person> listPerson = this.impl.consultPersons();
        return ResponseEntity.ok(listPerson); // ok -> vamos a obtener resultado
    }

    @PostMapping
    @RequestMapping(value = "createPerson", method = RequestMethod.POST)
    public ResponseEntity<?> createPerson(@RequestBody Person person){
        Person createdPerson = this.impl.createPerson(person);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdPerson);
    }

    @PutMapping
    @RequestMapping(value = "modifyPerson", method = RequestMethod.PUT)
    public ResponseEntity<?> modifyPerson(@RequestBody Person person){
        Person modifiedPerson = this.impl.modifyPerson(person);
        return ResponseEntity.status(HttpStatus.CREATED).body(modifiedPerson);
    }

    @GetMapping
    @RequestMapping(value = "searchPerson/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> searchPerson(@PathVariable int id){
        Person searchedPerson = this.impl.searchPerson(id);
        return ResponseEntity.ok(searchedPerson);
    }

    @DeleteMapping
    @RequestMapping(value = "deletePerson/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deletePerson(@PathVariable int id){
        this.impl.deletePerson(id);
        return ResponseEntity.ok().build(); // ok.build al eliminar
    }


}
