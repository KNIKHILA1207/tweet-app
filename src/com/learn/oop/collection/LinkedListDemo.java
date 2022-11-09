package com.learn.oop.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String args[]) {
		LinkedList<String> fru = new LinkedList<String>();
		fru.add("Mango");
		fru.add("Apple");
		fru.add("Oranges");
		
	
		fru.removeFirst();
		fru.removeLast();
		
		
		Iterator<String> itr = fru.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
