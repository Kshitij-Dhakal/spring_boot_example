package com.treeleaf.Spring.Boot.Demo.repo;

import com.treeleaf.Spring.Boot.Demo.model.Person;
import com.treeleaf.Spring.Boot.Demo.model.Phonenumber;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PhonenumberRepository extends JpaRepository<Person, Integer> {
    List<Phonenumber> findByPerson(String lastName);
}