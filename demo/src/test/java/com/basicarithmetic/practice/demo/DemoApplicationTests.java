package com.basicarithmetic.practice.demo;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	BasicService testService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testAdd() {
		assertEquals(3, testService.add(1,2));
	}

	@Test
	public void testSubtract() {
		assertEquals(-1, testService.subtract(1,2));
	}

	@Test
	public void testProduct() {
		assertEquals(20, testService.product(10,2));
	}

	@Test
	public void testDivision() {
		HashMap<String,Integer> answer = new HashMap<>();
		answer.put("quotient",2);
		answer.put("remainder",1);
		assertEquals(answer, testService.division(7,3));
	}
}
