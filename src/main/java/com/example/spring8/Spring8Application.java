package com.example.spring8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring8Application {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Spring8Application.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run(args);
    }

}
