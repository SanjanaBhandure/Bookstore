package com.bridgelabz.bookstoreapplicationbackend_spring.service;

import com.bridgelabz.bookstoreapplicationbackend_spring.dto.BookDTO;
import com.bridgelabz.bookstoreapplicationbackend_spring.entity.BookEntity;
import com.bridgelabz.bookstoreapplicationbackend_spring.util.Response;

import java.util.List;

public interface IBookService {

	// To add new book to store
	Response addNewBook(String token, BookDTO bookDto);


	// Get all books
	List<BookEntity> getAllBooks(String token);

	// To update book details
	Response updateBook(String token, BookDTO bookDto);

	// To delete user
	Response deleteBook(String token, String bookName);

	// To update book price
	Response updateBookPrice(String token, String bookName, Double price);

	// To update book quantity
	Response updateBookQuantity(String token, String bookName, int quantity);

}
