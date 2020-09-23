package com.treeleaf.Spring.Boot.Demo.model;

//javax.persistence.api

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Address")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class Address {
    @Id
    @GeneratedValue
    int id;
    String city;
    String state;
    String country;
    int zipCode;
}