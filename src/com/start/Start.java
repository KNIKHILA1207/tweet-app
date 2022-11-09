package com.start;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.start.student.Student;
import com.start.student.StudentDao;

public class Start {
	
	public static void main(String args[]) throws IOException {
		
		System.out.println("hello world");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("press 1 to add a student");
			System.out.println("press 2 to delete a student");
			System.out.println("press 3 to display a student");
			System.out.println("press 4 to exit a student");
			int choice = Integer.parseInt(br.readLine());
		 	
			if(choice==1) {
				
				System.out.println("Enter the Students fullname:");
				String name =br.readLine();
				
				System.out.println("Enter the Students phone number:");
				String phone = br.readLine();
	 			
				System.out.println("Enter Students city:");
				String city =br.readLine();
				
				Student st = new Student(name,phone,city);
				
				System.out.println(st);
	 	 		boolean answer= StudentDao.addStudenttoDB(st);
				if(answer) {
					System.out.println("Student added successfully");
				}
				else { 
					System.out.println("there is some problem pkease contact the admin");
				}
				
			}
		 	else if(choice==2) {
				
				System.out.println("Enter student id to delete");
				int studentId = Integer.parseInt(br.readLine());
				
				boolean answer=StudentDao.deleteStudent(studentId);
				if(answer) {
					System.out.println("Student deleted successfully");
				}
				else {
					System.out.println("there is some problem");
				}
				
			} 
			else if(choice==3) {
				
				StudentDao.getAllStudents();
			}
			else if(choice==4) {
				
			}else {
				
			}
			System.out.println("Thanks for using the student managements system");
		}
	}

}

