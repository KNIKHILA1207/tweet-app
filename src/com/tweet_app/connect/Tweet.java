package com.tweet_app.connect;
import com.tweet_app.connect.TweetDAO;


	public class Tweet {
		String email;
		String post;
		
		public Tweet(String email, String post) {
			super();
			this.email = email;
			this.post = post;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getpost() {
			return post;
		}

		public void setpost(String post) {
			this.post = post;
		}

		@Override
		public String toString() {
			return "post [email=" + email + ", post=" + post + "]";
		}
		
		
		

	}

