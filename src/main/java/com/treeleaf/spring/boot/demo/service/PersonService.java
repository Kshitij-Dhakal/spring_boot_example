package com.treeleaf.spring.boot.demo.service;

import com.treeleaf.spring.boot.demo.model.Person;
import com.treeleaf.spring.boot.demo.repo.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    private final PersonRepository repository;

    @Autowired
    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public Person save(Person person) {
        return repository.save(person);
    }

    public List<Person> findAll() {
        return repository.findAll();
    }

    public Optional<Person> findById(int id) {
        return repository.findById(id);
    }


}
