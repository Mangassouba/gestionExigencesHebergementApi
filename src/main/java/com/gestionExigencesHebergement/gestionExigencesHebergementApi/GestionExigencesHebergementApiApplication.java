package com.gestionExigencesHebergement.gestionExigencesHebergementApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestionExigencesHebergementApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionExigencesHebergementApiApplication.class, args);
		System.out.println("Demarage du serveur au port 8080 ...");
	}

}
