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
            Student joao = new Student("João", LocalDate.of(1991, Month.OCTOBER, 4), "jotaf.daniel@gmail.com");
            Student vitoria = new Student("Vitória", LocalDate.of(1993, Month.NOVEMBER, 7), "jotaf.daniel@gmail.com");

            repository.saveAll(List.of(joao, vitoria));
        };
    }
}
