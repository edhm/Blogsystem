package com.BlogSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BlogSystem.entity.Author;
import com.BlogSystem.service.implement.AuthorServiceImpl;

@RestController
public class AuthorController {
	@Autowired
	AuthorServiceImpl asi;

	@PostMapping("/addauthor/")
	public void add() {
		asi.addAuthor();
	}

	@GetMapping("/findbyidauthor/{id_authors}")
	public Author getAuthorUsingId(@PathVariable long id_authors) {
		return asi.findAllAuthorByID(id_authors);
	}

	@DeleteMapping("/deleteauthor")
	public void delete() {
		asi.deleteAllData();
	}
}
