package com.treeleaf.Spring.Boot.Demo.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Phonenumber")
public class Phonenumber {

    int homephonenumber;
    int mobilephonenumber;


    public Phonenumber(int homephonenumber, int mobilephonenumber) {
        this.homephonenumber = homephonenumber;
        this.mobilephonenumber =mobilephonenumber;

    }

    public String getHomePhoneNumber() {
        return homephonenumber;
    }

    public String getMobilePhoneNumber() {
        return mobilephonenumber;
    }

    public void setHomePhoneNumber(int HomePhoneNumber) {
        this.homephonenumber = homephonenumber;
    }

    public void setMobilePhoneNumber(int MobilePhoneNumber) {
        this.mobilephonenumber = mobilephonenumber;
    }
}

