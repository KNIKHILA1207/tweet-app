	package com.tweet_app.connect;

	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.Statement;

	public class UserDAO {

		private static Connection con = ConnectionProvider.createConnection();

		public static boolean registerNewUser(User user)  {

			boolean status = false;
			try {
				System.out.println("Hi " + user.getUserName());
				String query = "INSERT INTO `tweet_app`.`user` (`username`, `email`, `password`) VALUES (?,?,?)";
				PreparedStatement psmt = con.prepareStatement(query);
				psmt.setString(1, user.getUserName());
				psmt.setString(2, user.getEmail());
				psmt.setString(3, user.getPassword());

				psmt.executeUpdate();
				status = true;

			} catch (Exception e) {
				e.printStackTrace();
			}

			return status;

		}

		public static boolean userValidate(String userId, String pwd) {
			boolean status = false;
			try {

				String query = ("SELECT * FROM user ");

				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query);
				while (rs.next()) {
	                String user = rs.getString(1).toUpperCase();
					String email = rs.getString(2);
					String password = rs.getString(3);

					if (email.equals(userId) && password.equals(pwd)) {

						status = true;
						System.out.println("Hi "+user+", You have logged in successfully");
						System.out.println("");

					}
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

			return status;

		}

		public static boolean resetPassword(String newPassword, String id)  {
			
			boolean status=false;
			try {
				String query = "update user set password=? where email=?";
				PreparedStatement psmt = con.prepareStatement(query);
				psmt.setString(1, newPassword);
				psmt.setString(2, id);

				psmt.executeUpdate();
				
				status=true;
				
				
			} catch (Exception e) {
				e.printStackTrace();

			}
			return status;

			
			

		}

		public static boolean validatePassword(String id) {

			boolean status = false;
			try {

				String query = "SELECT email FROM user ";
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query);
				while (rs.next()) {

					String email = rs.getString(1);

					if (email.equals(id)) {

						status = true;

					}
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

			return status;

		}

		public static boolean resetOldPassword(String userId, String oldPassword) {

			boolean status = false;
			try {

				String query = String.format("SELECT password FROM user where email='%s'", userId);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query);
				while (rs.next()) {

					String password = rs.getString(1);

					if (password.equals(oldPassword)) {
						

						status = true;

				}
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

			return status;

		}

	}
	

