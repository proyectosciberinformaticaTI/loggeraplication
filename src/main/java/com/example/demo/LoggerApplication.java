package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggerApplication implements CommandLineRunner {

	private static Logger log = LoggerFactory.getLogger(LoggerApplication.class);


	public static void main(String[] args) {
		log.info("Iniciar aplicacion");
		SpringApplication.run(LoggerApplication.class, args);
		log.info("finald de la aplicacion");
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
