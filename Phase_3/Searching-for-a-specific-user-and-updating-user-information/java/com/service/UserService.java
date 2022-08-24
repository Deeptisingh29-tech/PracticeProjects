package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.User;
import com.dao.UserDao;

@Service
public class UserService {
	
	@Autowired
	UserDao userDao;
	
	public String searchUserById(int uid) {
		User u = userDao.searchUserById(uid);
		if(u == null) {
			String res = "<p style=\"color: red\">User details not present</p>";
			return res;
		}else {
			return u.toString();
		}
	}
	
	public String updateUser(User user) {
		if(userDao.updateUser(user)>0) {
			String res = "<p style=\"color: green\">User deatils updated succesfully...</p>";
			return res;
		}else {
			String res = "<p style=\"color: red\">User details did not update</p>";
			return res;
		}
	}

}
