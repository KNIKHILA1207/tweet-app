package com.start.student;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	
	static Connection con;
	
	public static Connection createC() {
		try {
			
			//Class.forName("com.mysql.cj.jdbc.driver");
			
			String user="root";
			String password="pass@word1";
			
			String url ="jdbc:mysql://localhost:3306/studentmanagement";
			
			con = DriverManager.getConnection(url,user,password);
		} catch(Exception e){
			e.printStackTrace();
			
		}
		return con;
		
	}

}
