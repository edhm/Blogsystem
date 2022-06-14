package com.BlogSystem.service;

import com.BlogSystem.entity.Author;
import com.BlogSystem.entity.Employee;

public interface AuthorService {
	// ArrayList<Employee> findAllEmployees();

	Author findAllAuthorByID(long id);

	void addAuthor();

	void deleteAllData();
}
