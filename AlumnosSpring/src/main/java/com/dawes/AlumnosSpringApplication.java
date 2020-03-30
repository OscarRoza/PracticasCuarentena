package com.dawes;

import javax.persistence.Persistence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlumnosSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlumnosSpringApplication.class, args);
		
		Persistence.createEntityManagerFactory("jpa", null);
	}

	
}
