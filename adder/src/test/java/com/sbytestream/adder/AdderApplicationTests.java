package com.sbytestream.adder;

import com.sbytestream.adder.services.AddService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AdderApplicationTests {
	@Test
	void calculationTest() {
		Assertions.assertEquals(30, getService().calculate(10, 20));
	}

	private AddService getService() {
		if (_service == null) {
			_service = new AddService();
		}
		return _service;
	}

	private AddService _service = null;
}
