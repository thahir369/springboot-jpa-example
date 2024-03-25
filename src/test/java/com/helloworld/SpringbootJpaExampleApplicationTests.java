package com.helloworld;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringbootJpaExampleApplicationTests {

	@Test
	void contextLoads() {
		assertEquals(1,2-1);
	}

}
