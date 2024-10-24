package com.example.cicd_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CicdTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CicdTestApplication.class, args);
	}

	@RestController
	class HelloConteroller{
		@GetMapping("/")
		public String hello(){
			return "Hello, CI/CD with Spring Boot!";
		}
	}

}
	