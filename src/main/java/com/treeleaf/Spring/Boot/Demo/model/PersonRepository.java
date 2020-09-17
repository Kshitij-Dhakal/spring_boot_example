package com.treeleaf.Spring.Boot.Demo.model;
import java.util.List;


public interface PersonRepository <Person, Long> {

    List<Person> findByLastName(String lastName);

    Person findById(int id);
}