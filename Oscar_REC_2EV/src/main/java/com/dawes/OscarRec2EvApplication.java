package com.dawes;

import javax.persistence.Persistence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OscarRec2EvApplication {

	public static void main(String[] args) {
		SpringApplication.run(OscarRec2EvApplication.class, args);

		Persistence.createEntityManagerFactory("jpa", null);

	}

}
