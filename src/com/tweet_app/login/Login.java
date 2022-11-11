package com.tweet_app.login;

	import java.util.Scanner;

import com.tweet_app.connect.Tweet;
import com.tweet_app.connect.TweetDAO;
import com.tweet_app.connect.UserDAO;

	public class Login {
		static Scanner sc = new Scanner(System.in);

		public static void loginUser() {

			System.out.println("************* Login ****************\n");
			System.out.println("");
			System.out.println("Enter your Login ID (Email-ID) :         ");
			String userId = sc.next();
			System.out.println("Enter your password :                 ");
			String password = sc.next();

			boolean valid = UserDAO.userValidate(userId, password);
			if (valid) {

				while (true) {

					System.out.println("1.Post Tweet");
					System.out.println("2.View my Tweets");
					System.out.println("3.View all Tweets");
					System.out.println("4.View all Users");
					System.out.println("5.Reset Password");
					System.out.println("6.Logout");
					System.out.println("");
					System.out.println("\n");
					System.out.println("");

					System.out.println("Select any option : ");
					int select = sc.nextInt();

					if (select == 1) {
						System.out.println("  Post here");
						System.out.println("tweet : ");
						String post = sc.next();
						post += sc.nextLine();
						Tweet newtweet = new Tweet(userId, post);
						TweetDAO.postTweet(newtweet);

	
					} else if (select == 2) {
						TweetDAO.viewMyTweets(userId);

				
					} else if (select == 3) {
						TweetDAO.viewAllTweets();


					} else if (select == 4) {
						TweetDAO.viewAllUsers();

		
					} else if (select == 5) {

						System.out.println("--------------Reset Your Password-----------------\n");
						System.out.println("Enter old password :");
						String oldPassword = sc.next();
						boolean test = UserDAO.resetOldPassword(userId, oldPassword);
						if (test) {
							System.out.println("Enter new password");
							String newPassword = sc.next();
							boolean changed = UserDAO.resetPassword(newPassword, userId);
							if (changed) {
								System.out.println(" Password is successfully changed.");
							}
						else {
							System.out.println(" Entered password is incorrect.");
					
						} }else if (select == 6) {
						
						System.out.println(" logged out successfully.");
						break;
					}

				}

			} 
			}else {
				System.out.println("Login ID / Password  is Incorrect.");
			
			}}
			
			
}
