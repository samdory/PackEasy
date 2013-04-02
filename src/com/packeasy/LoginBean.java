package com.packeasy;
//Data Encapsulation using Getters and Setters
public class LoginBean {
	private String username;
	private String password;
	private String realName;
	public boolean valid;
	public String getRealName()
	{
		return realName;
	}
	public void setRealName(String newRealName)
	{
		realName = newRealName;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String newPassword)
	{
		password = newPassword;
	}
	public String getUsername()
	{
		return username;
	}
	public void setUserName(String newUsername)
	{
		username = newUsername;
	}
	public boolean isValid()
	{
		return valid;
	}
	public void setValid(boolean newValid)
	{
		valid = newValid;
	}
}