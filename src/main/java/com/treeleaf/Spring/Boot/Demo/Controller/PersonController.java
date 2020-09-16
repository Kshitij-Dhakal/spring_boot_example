package com.treeleaf.Spring.Boot.Demo.Controller;

import com.treeleaf.Spring.Boot.Demo.model.Address;
import com.treeleaf.Spring.Boot.Demo.model.Person;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController()
public class PersonController {

    private static List<Person> fakeDatabase = new ArrayList<>();
    private static Random random = new Random();

    @GetMapping("/person")
    public List<Person> getAllPerson() {
        return fakeDatabase;
    }


    @GetMapping("/person/{id}")
    public Person getById(@PathVariable int id) {
        return fakeDatabase.get(id);
    }

    @PostMapping("/person")
    public Person save(@RequestBody Person person) {
        person.setId(fakeDatabase.size());
        fakeDatabase.add(person);
        return person;
    }
    @GetMapping("/address")
    public List<Address> getAllAddress() {
        return fakeDatabase;
    }
    @GetMapping("/address/{adddress}")
    public Person getByAddress(@PathVariable String address) {
        return fakeDatabase.get(id);
    }


    @GetMapping("/address")
    public Address  save(@RequestBody Address address){
     address.getAddress(fakeDatabase.size());
     fakeDatabase.add(address);
     return address;
    }


}
