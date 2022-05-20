package com.example.lybrary.exceptions;

import java.util.NoSuchElementException;

@SuppressWarnings("serial")
public class BookNotFoundException extends NoSuchElementException {

	public BookNotFoundException(String message) {
		super(message);
	}
	public BookNotFoundException() {
		super("Book(s) not found.");
	}
	
}
