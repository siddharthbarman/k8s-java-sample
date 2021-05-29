package com.sbytestream.multiplier;

import com.sbytestream.multiplier.services.MultiplyService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MultiplierApplicationTests {
	@Test
	void calculationTest() {
		Assertions.assertEquals(200, getService().calculate(10, 20));
	}

	private MultiplyService getService() {
		if (_service == null) {
			_service = new MultiplyService();
		}
		return _service;
	}

	private MultiplyService _service = null;
}
