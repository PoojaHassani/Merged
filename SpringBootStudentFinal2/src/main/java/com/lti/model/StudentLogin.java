package com.lti.model;

public class StudentLogin {

	private long aadharNo;
	private String password;
public StudentLogin() {
		super();
	}
public StudentLogin(long aadharNo, String password) {
	super();
	this.aadharNo = aadharNo;
	this.password = password;
}
public long getAadharNo() {
	return aadharNo;
}
public void setAadharNo(long aadharNo) {
	this.aadharNo = aadharNo;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}	
}
