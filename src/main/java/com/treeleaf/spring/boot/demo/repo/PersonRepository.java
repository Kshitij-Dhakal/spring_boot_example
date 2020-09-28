package com.treeleaf.spring.boot.demo.repo;

import com.treeleaf.spring.boot.demo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}