package com.learn.oop.Abstraction;

public class CSK extends IPL{

	void play()
	{
		System.out.println("CSK is playing good in 2021 season");
	}
	public static void main(String args[]) {
		CSK obj = new CSK();
		obj.play();
	}
}
