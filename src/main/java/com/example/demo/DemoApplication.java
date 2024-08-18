package com.example.demo;

import com.example.demo.service.HttpService;
import com.example.demo.types.Departure;
import com.example.demo.types.DeparturesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	HttpService service;
	@RestController
	class Helloworld {
		@GetMapping("/")
		public String greet() {
			return "Hello Dileepa Welcome!";
		}

		@GetMapping("/ping")
		public List<Departure> ping() throws Exception {
			return service.getList().getDepartures();
		}
	}
}
