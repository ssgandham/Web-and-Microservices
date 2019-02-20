package com.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.example")
public class ProjectMain {

    public static void main(String[] args) {
        SpringApplication.run(ProjectMain.class, args);
    }
}
