package com.learn.oop.exception;

import java.io.IOException;

class Car1{
	
	void breakDown()throws IOException{
		throw new IOException("this car is broken down");
	}
}

public class RiskyCar {
	
	public static void main(String args[]) {
		
		try {
			Car1 c1 = new Car1();
			c1.breakDown();
		} catch(Exception e) {
			System.out.println("Exception handled"+e);
		}
		System.out.println("continue....");
	}

}
