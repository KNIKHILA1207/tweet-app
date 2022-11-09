package com.learn.oop;

public class Sales extends Employee {
	
	Integer Bonus = 10000;
	Integer insentive;
	
	void working() {
		System.out.println("Employee is a part of Sales Team and they are working");
	}
	 
	public static void main(String args[]) {
		Sales Vinaya = new Sales();
		Vinaya.insentive= 2000;
		Vinaya.TotalSalary(Vinaya.BaseSalary,Vinaya.Bonus,Vinaya.insentive);
		Vinaya.working();
	}

}
