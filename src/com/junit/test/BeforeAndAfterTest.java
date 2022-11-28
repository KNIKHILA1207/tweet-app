package com.junit.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.junit.demo.Calculator;

public class BeforeAndAfterTest {
	Calculator calc;
	
	@BeforeEach
	public void init() {
		calc = new Calculator();
		System.out.println("the before each method is being called right now");
	}
     
	@AfterEach
	public void after() {
		System.out.println("After each test case");
	}
	
	@Test
	@DisplayName("Adding two positive numbers")
	public void testAddMethod() {
		Calculator calc = new Calculator();
		int sum = calc.add(10, 100);
		assertEquals(110,sum);
		System.out.println("the total is:"+sum);
	}
	
	@Test
	@DisplayName("Subtracting two positive numbers")
	public void testSubMethod() {
		Calculator calc = new Calculator();
		int sum = calc.sub(10, 100);
		assertEquals(-90,sum);

		System.out.println("the total is:"+sum);
	}
	@Test
	@DisplayName("Multiplying two positive numbers")
	public void testProductMethod() {
		Calculator calc = new Calculator();
		int sum = calc.product(5, 100);
		assertEquals(500,sum);

		System.out.println("the total is:"+sum);
	}

}
