package com.ducna1.learnspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication
@SpringBootApplication(exclude = org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class)
public class LearnspringApplication {
	public static void main(String[] args) {
		SpringApplication.run(LearnspringApplication.class, args);
	}

}
