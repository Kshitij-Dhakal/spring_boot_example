package com.treeleaf.Spring.Boot.Demo.repo;

import com.treeleaf.Spring.Boot.Demo.model.Address;
import com.treeleaf.Spring.Boot.Demo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepository extends JpaRepository<Person, Integer> {
    List<Address> findByPerson(String lastName);
}