package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student joao = new Student("João", 29, LocalDate.of(1991, Month.OCTOBER, 4), "jotaf.daniel@gmail.com");
            Student pedro = new Student("Pedro", 29, LocalDate.of(1991, Month.OCTOBER, 4), "jotaf.daniel@gmail.com");

            repository.saveAll(List.of(joao, pedro));
        };
    }
}
