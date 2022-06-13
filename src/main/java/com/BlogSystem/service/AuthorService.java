package com.BlogSystem.service;

import com.BlogSystem.entity.Author;

public interface AuthorService {
	Author findAllAuthorById(Long id);

	void addAuthor();

	void deleteAllData();

}
