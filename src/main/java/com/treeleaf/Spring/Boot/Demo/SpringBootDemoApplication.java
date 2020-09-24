package com.treeleaf.Spring.Boot.Demo;

import com.treeleaf.Spring.Boot.Demo.model.Address;
import com.treeleaf.Spring.Boot.Demo.model.Person;
import com.treeleaf.Spring.Boot.Demo.repo.AddressRepository;
import com.treeleaf.Spring.Boot.Demo.repo.PersonRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }

}


