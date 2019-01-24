package com.dawn.embedded_mongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmbeddedMongodbApplication {

	public static void main(String[] args) {
		System.out.println("Hello Embedded MongoDB");
		SpringApplication.run(EmbeddedMongodbApplication.class, args);
	}

}

