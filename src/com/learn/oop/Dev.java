package com.learn.oop;

public class Dev extends Employee {
	
	Integer Bonus = 25000;
	Integer total = Bonus + BaseSalary;
	public static void main(String args[]) {
		Dev Nithin = new Dev();
		System.out.println("Total Slary of Nithin is:"+Nithin.total);
	
	}
	
	
}
