
package com.treeleaf.Spring.Boot.Demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name="Phonenumber")
public class Phonenumber {

    int homephonenumber;
    int mobilephonenumber;


}