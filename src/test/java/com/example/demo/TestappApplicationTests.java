package com.example.demo;

import org.assertj.core.api.IntegerAssert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class TestappApplicationTests {

	@Test
	void contextLoads() {
		ApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.getBean("testMapper");	
	}
	
	@Test
	void test() {
		
		String a = null;
		a.equals("abcdefg");

	}

}
