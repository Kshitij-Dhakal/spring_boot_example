package com.treeleaf.Spring.Boot.Demo.Controller;

import com.treeleaf.Spring.Boot.Demo.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public Greeting sayHello() {
        return new Greeting(System.currentTimeMillis(), "Hello");
    }
}
