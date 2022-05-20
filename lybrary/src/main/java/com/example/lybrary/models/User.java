package com.example.lybrary.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private String mobileNo;
	private String name, emailId;
	
	public User() {
		super();
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "User [mobileNo=" + mobileNo + " ,name= " + name + ", emailId=" + emailId + ", issuedOn=" + "]";
	}
}
