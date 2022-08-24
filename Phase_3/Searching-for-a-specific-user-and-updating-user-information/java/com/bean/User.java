package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private int uid;
	private String uname;
	private String email;
	private int age;
	private String picture;
	
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		String myUrl = "<img src="+picture+" width=200 height=200/>";
		String b = "<br>";
		return " User ID : " + uid +b+ "User Name : " + uname + b+ "User email : " + email + b+ "User age : " + age + b + myUrl
				;
	}
	
	

}
