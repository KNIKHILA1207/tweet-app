package com.learn.oop.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	
	public static void main(String args[]) {
		
		HashSet<String> members=new HashSet<String>();
		
		members.add("nithin");
		members.add("Nikhila");
		members.add("Vinusha");
		members.add("tripura");
		
		members.remove("tripura");
		
		Iterator<String> its= members.iterator();
		while(its.hasNext()) {
			System.out.println(its.next());
			}
		}
	
	

}
