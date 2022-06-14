package com.BlogSystem.service;

import com.BlogSystem.entity.BooksEntity;

public interface BooksService {
	BooksEntity findAllBooksByID(long id);

	void addBooks();

	void deleteBooks();
}
