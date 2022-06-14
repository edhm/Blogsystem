package com.BlogSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BlogSystem.entity.BooksEntity;
import com.BlogSystem.service.implement.BooksServiceImpl;

@RestController
public class BooksController {
	@Autowired
	BooksServiceImpl bsi;

	@PostMapping("/addbooks/")
	public void add() {
		bsi.addBooks();
	}

	@GetMapping("/findbyidbooks/{id_books}")
	public BooksEntity getBooksUsingId(@PathVariable long id_books) {
		return bsi.findAllBooksByID(id_books);
	}

	@DeleteMapping("/deletebooks")
	public void delete() {
		bsi.deleteBooks();
	}
}
