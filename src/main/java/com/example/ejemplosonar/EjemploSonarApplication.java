package com.example.ejemplosonar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EjemploSonarApplication {

    public static void main(String[] args) {
        SpringApplication.run(EjemploSonarApplication.class, args);
    }



	public void connectToDatabase() {
		String username = System.getenv("DB_USERNAME");
		String password = System.getenv("DB_PASSWORD");
		System.out.println("Conectando a la base de datos con usuario: " + username + ""
				+ " y contraseña: " + password);
		// Lógica de conexión omitida
	}
	
}