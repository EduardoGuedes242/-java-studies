package com.eduardoguedes.dockerspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DockerspringApplication {

	@GetMapping
	String unico() {
		return "App no Ar com docker";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerspringApplication.class, args);
	}

}
