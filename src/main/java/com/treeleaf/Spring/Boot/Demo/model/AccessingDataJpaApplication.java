package com.treeleaf.Spring.Boot.Demo.model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AccessingDataJpaApplication {

    private static final Logger log = LoggerFactory.getLogger(AccessingDataJpaApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AccessingDataJpaApplication.class);
    }

    @Bean
    public CommandLineRunner demo(PersonRepository repository) {
        return (args) -> {
         
            repository.save(new Person("Shyam", "Bahadur"));
            repository.save(new Person("Ram", "Koirala"));
            repository.save(new Person("Kim", "K"));
            repository.save(new Person("David", "Beckham"));
            repository.save(new Person("Michelle", "Obama"));

          
            log.info("Person with findAll():");
            log.info("************************");
            for (Person person : repository.findAll()) {
                log.info(person.toString());
            }
            log.info("");

           
            Person person = repository.findById(1L);
            log.info("Person found with findById(1L):");
            log.info("*************************");
            log.info(person.toString());
            log.info("");

            log.info("Person found  findByLastName('Beckham'):");
            log.info("****************************");
            repository.findByLastName("Beckham").forEach(beckham -> {
                log.info(beckham.toString());
            });
            log.info("");
        };
    }

}