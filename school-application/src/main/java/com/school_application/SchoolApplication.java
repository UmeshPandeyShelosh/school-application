package com.school_application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SchoolApplication {

	private static final Logger logger = LoggerFactory.getLogger(SchoolApplication.class);
	
	public static void main(String[] args) {
		logger.info("Application started");
		SpringApplication.run(SchoolApplication.class, args);
	}

}
