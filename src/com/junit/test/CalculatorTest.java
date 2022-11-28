package com.junit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.junit.demo.Calculator;

public class CalculatorTest {

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
