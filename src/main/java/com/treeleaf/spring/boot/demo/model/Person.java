package com.treeleaf.spring.boot.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Person {
    @Id
    String id;
    String name;
    int age;
    //@OneToMany(mappedBy = "Person", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
}
