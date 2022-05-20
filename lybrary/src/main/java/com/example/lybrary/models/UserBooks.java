package com.example.lybrary.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserBooks {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int uId;
	private String mobileNo;
	private int bookId;
	private String issuedOn, returnedOn, purchasedOn;
	

	public UserBooks() {
		super();
	}
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getIssuedOn() {
		return issuedOn;
	}
	public void setIssuedOn(String issuedOn) {
		this.issuedOn = issuedOn;
	}
	public String getReturnedOn() {
		return returnedOn;
	}
	public void setReturnedOn(String returnedOn) {
		this.returnedOn = returnedOn;
	}
	public String getPurchasedOn() {
		return purchasedOn;
	}
	public void setPurchasedOn(String purchasedOn) {
		this.purchasedOn = purchasedOn;
	}
	@Override
	public String toString() {
		return "UserBooks [uId=" + uId + ", mobileNo=" + mobileNo + ", bookId=" + bookId + ", issuedOn=" + issuedOn + ", returnedOn="
				+ returnedOn + ", purchasedOn=" + purchasedOn + "]";
	}
}
