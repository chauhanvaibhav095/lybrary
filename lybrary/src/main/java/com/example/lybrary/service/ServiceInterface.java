package com.example.lybrary.service;

import java.util.List;

import com.example.lybrary.models.Book;
import com.example.lybrary.models.Request;
import com.example.lybrary.models.Response;

public interface ServiceInterface {
	Response addBooksInLibrary(List<Book> books);
	Response issueBooks(Request bookIssueObject);
}
