package com.ikumbu.ibsys.Student;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repo) {
        return args -> {
            Student Mariam = new Student("mariam", "ma@gmail.com", LocalDate.of(2005, Month.APRIL, 5));
            Student John = new Student("john", "john@gmail.com", LocalDate.of(2000, Month.APRIL, 5));
            repo.saveAll(List.of(Mariam, John));
        };
    }
}
