package com.dev.gmail;

public class Account {

	public int User_Id;
	public String User_Name;
	public String Password;
	public String Email;


	public int getUser_Id() {
		return User_Id;
	}
	public void setUser_Id(int user_Id) {
		User_Id = user_Id;
	}
	public String getUser_Name() {
		return User_Name;
	}
	public void setUser_Name(String user_Name) {
		User_Name = user_Name;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getEmail() {
		return Email;
	}
	public String setEmail(String email) {
		Email = email;
		return email;
	}



}
