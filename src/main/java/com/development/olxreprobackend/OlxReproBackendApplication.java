package com.development.olxreprobackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.development.controller.ConnectionFactory;

@SpringBootApplication
public class OlxReproBackendApplication {

	public static void main(String[] args) throws ClassNotFoundException {
		SpringApplication.run(OlxReproBackendApplication.class, args);
		ConnectionFactory conect = new ConnectionFactory();
		conect.connection();
	}

}
