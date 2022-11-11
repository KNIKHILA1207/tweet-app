package com.tweet_app.connect;

	import java.sql.Connection;
	import java.sql.DriverManager;

	public class ConnectionProvider {
		
		static Connection con;
		
		
		public static Connection createConnection(){
		
		try {
			//Loading Driver 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Creating Connection to database
			String userName ="root";
			String password ="pass@word1";
			String url= "jdbc:mysql://localhost:3306/tweet_app";
			con=DriverManager.getConnection(url,userName,password);
			
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
		
		return con;
		}
		
		

	}

		


