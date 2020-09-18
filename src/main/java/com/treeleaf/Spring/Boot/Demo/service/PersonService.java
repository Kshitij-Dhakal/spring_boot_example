package com.treeleaf.Spring.Boot.Demo.service;

import com.treeleaf.Spring.Boot.Demo.model.Person;
import com.treeleaf.Spring.Boot.Demo.repo.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PersonService {

    private final PersonRepository repository;

    @Autowired
    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public Person save(Person person) {
        person.setId(UUID.randomUUID().toString());
        return repository.save(person);
    }

    public List<Person> findAll() {
        return repository.findAll();
    }

    public Optional<Person> findById(int id) {
        return repository.findById(id);
    }


}
