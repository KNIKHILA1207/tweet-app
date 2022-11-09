package com.learn.oop;

public class Employee {
		
		Integer BaseSalary = 50000;
		
		void TotalSalary (Integer BS, Integer Bonus) {
			Integer Total = BS +Bonus;
			System.out.println(Total);
		}
void TotalSalary(Integer BS,Integer Bonus,Integer insentive) {
	Integer Total=BS + Bonus + insentive;
	System.out.println(Total);
}
void Working() {
	System.out.println("Employee is working");
}


}
