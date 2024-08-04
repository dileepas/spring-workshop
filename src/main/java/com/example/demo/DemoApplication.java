package com.example.demo;

import com.example.demo.service.HttpService;
import com.example.demo.types.DeparturesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

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
			return "Hello!";
		}

		@GetMapping("/ping")
		public DeparturesResponse ping() throws Exception {
/*            String url = "https://transport.integration.sl.se/v1/sites/4305/departures?transport=BUS&line=474&direction=2";
			HttpRequest req = HttpRequest.newBuilder().uri(new URI(url)).GET().build();
			HttpResponse<String> response = HttpClient.newHttpClient().send(req, BodyHandlers.ofString());
			String res = response.body();
			ObjectMapper objectMapper = new ObjectMapper();
			DeparturesResponse  list = objectMapper.readValue(res, DeparturesResponse.class);*/
			return service.getList();
		}
	}
}
