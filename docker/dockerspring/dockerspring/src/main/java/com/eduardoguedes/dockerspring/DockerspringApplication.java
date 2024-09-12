package com.eduardoguedes.dockerspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerspringApplication {

	@GetMapping
	public String unico() {
		return "Aplicação no ar";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerspringApplication.class, args);
	}

}
