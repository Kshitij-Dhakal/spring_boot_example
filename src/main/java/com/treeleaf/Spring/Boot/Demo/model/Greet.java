package com.treeleaf.Spring.Boot.Demo.model;

import lombok.Data;

@Data
public class Greet {
    String message;

    public Greet() {
    }

    public Greet(String message) {
        this.message = message;
    }
}
