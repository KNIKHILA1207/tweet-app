package com.learn.oop.collection;

import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo {
	public static void main(String args[]) {
		
		ArrayList<String> ParticipantsList = new ArrayList();
		ParticipantsList.add("Nikhila");
		ParticipantsList.add("Nithin");
		ParticipantsList.add("Vinusha");
		ParticipantsList.add("Sathvika");
		ParticipantsList.add("Manasa");
		
		Iterator itr= ParticipantsList.iterator();
		
		while(itr.hasNext()) {
		
		System.out.println(itr.next());
		
		
	}

	}
	}