package com.treeleaf.Spring.Boot.Demo.model;


public class Address {
    String address;
    String city;
    String state;
    String country;
    int zipCode;

    public Address(String address, String city, String state, String country, int zipCode) {
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public int getZipCode() {
        return zipCode;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
}

