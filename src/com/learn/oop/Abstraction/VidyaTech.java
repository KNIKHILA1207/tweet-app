package com.learn.oop.Abstraction;

public class VidyaTech implements ITCompanies {

	@Override
	public void Working() {
	
	System.out.println("Vidya Tech  is working on a java project");
		
	}
	public static void main(String args[]) {
		VidyaTech SMS = new VidyaTech();
		SMS.Working();
	}
	

}
