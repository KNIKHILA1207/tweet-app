package com.learn.oop;

public class HR extends Employee {
	
	Integer Bonus = 20000;
	Integer total = Bonus + BaseSalary;
	 
	public static void main(String args[]) {
		
		HR Vinusha = new HR();
		Vinusha.TotalSalary(Vinusha.BaseSalary,Vinusha.Bonus);
	}
	
	


}
