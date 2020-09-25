package com.treeleaf.Spring.Boot.Demo.repo;

import com.treeleaf.Spring.Boot.Demo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}