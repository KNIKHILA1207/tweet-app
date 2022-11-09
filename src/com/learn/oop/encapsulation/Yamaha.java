package com.learn.oop.encapsulation;

public class Yamaha {
	
	public static void main(String args[]) {
		Bike FZ = new Bike();
		
		FZ.setName("Yamaha FZ");
		FZ.setCC(150);
		FZ.setColor("blue");
		FZ.setPrice(90000);
		
		System.out.println(FZ.getName());
	}

}
