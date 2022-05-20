package com.example.lybrary.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.lybrary.models.Book;
import com.example.lybrary.models.Request;
import com.example.lybrary.models.Response;
import com.example.lybrary.models.User;
import com.example.lybrary.models.UserBooks;
import com.example.lybrary.service.ServiceInterface;

@RestController
public class Controller {
	
	@Autowired
	private ServiceInterface si;
	
	@PostMapping("/addBooks")
	public Response addBooks(@RequestBody List<Book> books) {
		return si.addBooksInLibrary(books);
	}
	
	@PostMapping("/issueBooks")
	public Response issueBooks(@RequestBody Request bookIssueObject) {
		return si.issueBooks(bookIssueObject);
	}
	
	@GetMapping("/test")
	public Request bookIssueObject() {
		User user = new User();
		user.setEmailId("chauhanvaibhav095@gmail.com");
		user.setMobileNo("9871263866");
		user.setName("Vaibhav");
		UserBooks userBooks1 = new UserBooks();
		userBooks1.setBookId(1001);
		userBooks1.setIssuedOn("2022/05/19");
		userBooks1.setMobileNo("9871263866");
		UserBooks userBooks2 = new UserBooks();
		userBooks2.setBookId(1002);
		userBooks2.setIssuedOn("2022/05/19");
		userBooks2.setMobileNo("9871263866");
		List<UserBooks> userBooks = new ArrayList<>();
		userBooks.add(userBooks1);
		userBooks.add(userBooks2);
		Request r = new Request(user, userBooks);
		return r;
	}
}
