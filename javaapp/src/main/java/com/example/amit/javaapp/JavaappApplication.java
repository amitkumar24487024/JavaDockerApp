package com.example.amit.javaapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController("/api")
public class JavaappApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaappApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(){
		return "Hello World";
	}
}
