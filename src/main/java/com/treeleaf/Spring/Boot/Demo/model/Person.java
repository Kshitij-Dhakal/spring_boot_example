package com.treeleaf.Spring.Boot.Demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
@Data
public class Person {
    @Id
    String id;
    String name;
    int age;

    //OneToOne
    Address address;

    //OneToMany / ManyToOne
    List<String> phoneNumbers;

    //ManyToMany
    List<String> subjects;

    //@OneToMany(mappedBy = "Person", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
}
