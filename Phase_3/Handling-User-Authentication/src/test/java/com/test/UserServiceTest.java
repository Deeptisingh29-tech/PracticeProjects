package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.service.UserService;

@DisplayName(value = "User-Authentication-testcase")
class UserServiceTest {

	@Test
	void testCheckUser() {
		//fail("Not yet implemented");
		UserService us = new UserService();
		String result = us.checkUser("user@gmail.com", "1234");
		assertEquals("success", result);
		
		String result1 = us.checkUser("usr@gmail.com", "1234");
		assertEquals("failure", result1);
		
		String result2 = us.checkUser("user@gmail.com", "123");
		assertEquals("failure", result2);
	}

}
