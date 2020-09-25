package com.treeleaf.Spring.Boot.Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }
/*
   @Bean
    public CommandLineRunner mappingDemo(PersonRepository personRepository,
                                         AddressRepository addressRepository, PhonenumberRepository phonenumberRepository) {
        return args -> {


            Person person = new Person("123", "Anjal", "23");
            personRepository.save(person);


            addressRepository.save(new Address());
            addressRepository.save(new Address("nyc", "NY", "USA"),person);

            phonenumberRepository.save(new Phonenumber());
            phonenumberRepository.save(new Phonenumber("1293232312","1221234232"),person);

        };
    }
*/

}


