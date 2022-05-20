package com.example.lybrary.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lybrary.dao.BookRepository;
import com.example.lybrary.dao.UserBooksRepository;
import com.example.lybrary.dao.UserRepository;
import com.example.lybrary.exceptions.BookNotFoundException;
import com.example.lybrary.models.Book;
import com.example.lybrary.models.Request;
import com.example.lybrary.models.Response;
import com.example.lybrary.models.Status;
import com.example.lybrary.models.User;
import com.example.lybrary.models.UserBooks;

@Service
public class ServiceImplementation implements ServiceInterface{
	
	@Autowired
	private BookRepository br;
	
	@Autowired
	private UserRepository ur;
	
	@Autowired
	private UserBooksRepository ubr;

	@Override
	public Response addBooksInLibrary(List<Book> books) {
		Response response = new Response();
		Status status = new Status();
		try {
			br.saveAll(books);
			status.setCode(1);
			status.setMessage("Book(s) added.");
			response.setBooks(books);
			response.setStatus(status);
		} catch (Exception e) {
			status.setCode(-1);
			status.setMessage(e.toString());
			response.setBooks(null);
			response.setStatus(status);
			System.out.println(e);
		}
		return response;
	}

	@Override
	public Response issueBooks(Request bookIssueObject) {
		Response response = new Response();
		Status status = new Status();
		User user = bookIssueObject.getUser();
		List<UserBooks> userBooks = bookIssueObject.getUserBooks();
		if(userBooks != null) {
			if(!user.getMobileNo().isEmpty()) {
				try {
					updateQuantity(userBooks);
					ur.save(user);
					ubr.saveAll(userBooks);
					status.setCode(1);
					status.setMessage("Book(s) issued.");
					response.setStatus(status);
					response.setUser(user);
					response.setUserBooks(userBooks);
				} catch (BookNotFoundException e) {
					status.setCode(-1);
					status.setMessage(e.toString().substring(e.toString().indexOf(':')+2));
					response.setStatus(status);
					e.printStackTrace();
				}
				
			} else {
				status.setCode(-1);
				status.setMessage("User not valid.");
				response.setStatus(status);
			}
		} else {
			status.setCode(-1);
			status.setMessage("No book added.");
			response.setStatus(status);
		}
		return response;
	}

	private void updateQuantity(List<UserBooks> userBooks) {
		try {
			for(int i=0; i<userBooks.size(); i++) {
				Optional<Book> b = br.findById(userBooks.get(i).getBookId());
				Book book = b.get();
				book.setQuantity(book.getQuantity()-1);
				br.save(book);
			}
		} catch (Exception e) {
			throw new BookNotFoundException("Book(s) not found.");
		}
	}
}
