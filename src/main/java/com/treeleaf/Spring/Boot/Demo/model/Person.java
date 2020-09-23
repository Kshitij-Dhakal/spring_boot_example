package com.treeleaf.Spring.Boot.Demo.model;

import javax.persistence.*;
import java.util.List;

@Entity

//@Table(name="Person")

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

    public Person() {
    }

    public Person(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
