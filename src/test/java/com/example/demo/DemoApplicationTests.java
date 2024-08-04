
package com.example.demo;

import com.example.demo.service.HttpService;
import com.example.demo.types.DeparturesResponse;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void test() throws Exception {
		HttpService service = new HttpService();
		DeparturesResponse list = service.getList();
		assert (list.getDepartures().size() > 0);
	}
}

