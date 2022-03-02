package com.ikumbu.ibsys;

import com.ikumbu.ibsys.Student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication

public class IbsysApplication {

    public static void main(String[] args) {
        SpringApplication.run(IbsysApplication.class, args);
    }

}
