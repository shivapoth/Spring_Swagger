package com.spring.dao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.BookRepo;
import com.spring.model.Book;

@Service
public class BookService {

	@Autowired
	private BookRepo bookRepo;

	public String saveBook(Book book) {

		bookRepo.save(book);

		return "book saved with id : " + book.getBookId();
	}

	public Book getBook(int bookId) {

		return bookRepo.findById(bookId).get();
	}

	public List<Book> removeBook(int bookId) {

		bookRepo.deleteById(bookId);

		return bookRepo.findAll();
	}
}
