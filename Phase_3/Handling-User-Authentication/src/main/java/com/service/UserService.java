package com.service;

public class UserService {
	
	public String checkUser(String email, String password) {
		if(email.equals("user@gmail.com") && password.equals("1234")) {
			return "success";
		}
		else {
			return "failure";
		}
	}

}
