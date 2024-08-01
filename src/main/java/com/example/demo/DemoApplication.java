package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RestController
	class Helloworld {
		@GetMapping("/slussen")
		public String routeToSlussen() {
			return "Slussen!";
		}

		@GetMapping("/ping")
		public String ping() {
			return "Dileepa Fernando ...!";
		}
	}
}
