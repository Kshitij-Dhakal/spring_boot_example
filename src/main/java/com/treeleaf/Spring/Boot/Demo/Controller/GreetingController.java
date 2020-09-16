package com.treeleaf.Spring.Boot.Demo.Controller;

import com.treeleaf.Spring.Boot.Demo.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public Greeting sayHello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(System.currentTimeMillis(), "Hello " + name);
    }
}
