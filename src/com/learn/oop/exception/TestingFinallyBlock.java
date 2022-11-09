package com.learn.oop.exception;

public class TestingFinallyBlock {
	
	public static void main(String args[]) {
		
		try {
			System.out.println("Inside the try block");
		}catch(NullPointerException e) {
			
			System.out.println(e);
			
		}
		finally {
			System.out.println("this bit is executed regardless of the exception or not");
		}
		System.out.println("Continue:");
	}

}
