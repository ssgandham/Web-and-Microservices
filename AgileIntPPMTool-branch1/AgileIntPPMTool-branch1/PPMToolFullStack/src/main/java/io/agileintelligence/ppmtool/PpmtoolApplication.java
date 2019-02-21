package io.agileintelligence.ppmtool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages="com.example.entity")
@SpringBootApplication
public class PpmtoolApplication {

    public static void main(String[] args) {
        SpringApplication.run(PpmtoolApplication.class, args);
    }
}
