package com.example.lybrary.models;

import java.util.List;

public class Response {
	private List<Book> books;
	private User user;
	private Status status;
	private List<UserBooks> userBooks;
	
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public List<UserBooks> getUserBooks() {
		return userBooks;
	}
	public void setUserBooks(List<UserBooks> userBooks) {
		this.userBooks = userBooks;
	}
	@Override
	public String toString() {
		return "Response [books=" + books + ", user=" + user + ", status=" + status + ", userBooks=" + userBooks + "]";
	}
}
