package com.treeleaf.spring.boot.demo.controller;

import com.treeleaf.spring.boot.demo.model.Person;
import com.treeleaf.spring.boot.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Controller-Service-Repository
 */
@RestController
public class PersonController {

    private final PersonService service;

    @Autowired
    public PersonController(PersonService service) {
        this.service = service;
    }

    @GetMapping("/person")
    public List<Person> getAllPerson() {
        return service.findAll();
    }


    @GetMapping("/person/{id}")
    public Optional<Person> getById(@PathVariable int id) {
        return service.findById(id);
    }

    @PostMapping("/person")
    public Person save(@RequestBody Person person) {
        return service.save(person);
    }

}
