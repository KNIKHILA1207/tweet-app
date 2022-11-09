package com.learn.oop.exception;

public class TryTest {
	public static void main(String args[]) {
		try {
			Integer num = 100 / 0;
			
		} catch(ArithmeticException e) {
			System.out.println(e);
			
		}
		System.out.println("Continue");
	}

}
