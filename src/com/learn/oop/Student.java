package com.learn.oop;

public class Student {
	
	Integer id;
	String name;
	Address address;
	
	void addStudent(Integer id,String name,Address address) {
		this.id = id;
		this.name = name;
		this.address =address;
	}
void displayStudent() {
	System.out.println(name+" "+address.city+" "+address.country);
}

public static void main (String args[]) {
	Address VidyaAddress  = new Address("Banglore","Karnataka","India");
	
	Student Vidya = new Student();
	Vidya.addStudent(101,"Vidya Gaddam", VidyaAddress);
	Vidya.displayStudent();
}
}
