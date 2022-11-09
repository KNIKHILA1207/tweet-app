package com.learn.oop.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	
	public static void main(String args[]) {
		
		LinkedHashSet<String> laptops = new LinkedHashSet<String>();
		
		laptops.add("HP");
		laptops.add("lenovo");
		laptops.add("Dell");
		laptops.add("HP");
		laptops.add("HP");
		
		Iterator<String> its= laptops.iterator();
		while(its.hasNext()) {
			System.out.println(its.next());
			}

	}

}
