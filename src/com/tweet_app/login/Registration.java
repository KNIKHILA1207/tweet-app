
	package com.tweet_app.login;

	import java.sql.SQLException;
	import java.util.Scanner;

import com.tweet_app.connect.User;
import com.tweet_app.connect.UserDAO;

	public class Registration {
		static Scanner sc = new Scanner(System.in);

		public static void userRegistration() throws SQLException {

			System.out.println("Registration\n");
			System.out.println("");

			System.out.println("Enter username:   ");
			String userName = sc.next();
			System.out.println("Enter password :    ");
			String password = sc.next();
			System.out.println("Enter Email Id :   ");
			String email = sc.next();

			User user = new User();
			user.setUserName(userName);
			user.setPassword(password);
			user.setEmail(email);
			boolean status = UserDAO.registerNewUser(user);
			if (status) {
				System.out.println("  Successfully registered");
			} else {
				System.out.println("Error,Please try again or Contact to Admin.");
			}

		}

	}


