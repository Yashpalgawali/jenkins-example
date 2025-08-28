package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleForJenkisApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleForJenkisApplication.class, args);
		
		System.err.println("This is the Jenkins Example");
		System.err.println("This is the Jenkins Example (UPDATED)");
	}

}
