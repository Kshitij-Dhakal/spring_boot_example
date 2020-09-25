package com.treeleaf.Spring.Boot.Demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Data
@Entity
public class Person {
    @Id
    String id;
    String name;
    int age;
    //@OneToMany(mappedBy = "Person", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
}
