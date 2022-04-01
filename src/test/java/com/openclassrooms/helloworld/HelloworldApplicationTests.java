package com.openclassrooms.helloworld;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.openclassrooms.helloworld.HelloworldApplication;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class HelloworldApplicationTests {
	@Autowired
	private BusinessService bs;
	@Test
	void contextLoads() {
	}
	@Test
	//check attribute value contains "Hello World"
	void testgetHellowOrld() {
		String expected = "Hello World";
		String result = bs.getHelloWorld().getValue();
		assertEquals(expected, result);

	}

}
