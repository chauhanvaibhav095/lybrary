package com.example.lybrary.models;

import java.util.List;

public class Request {
	private User user;
	private List<UserBooks> userBooks;
	
	public Request(User user, List<UserBooks> userBooks) {
		super();
		this.user = user;
		this.userBooks = userBooks;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<UserBooks> getUserBooks() {
		return userBooks;
	}
	public void setUserBooks(List<UserBooks> userBooks) {
		this.userBooks = userBooks;
	}
	@Override
	public String toString() {
		return "Request [user=" + user + ", userBooks=" + userBooks + "]";
	}
}
