package com.BlogSystem.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BlogSystem.entity.Author;
import com.BlogSystem.entity.Employee;
import com.BlogSystem.service.implement.AuthorServiceImpl;
import com.BlogSystem.service.implement.EmployeeServiceImpl;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeServiceImpl esi;
	AuthorServiceImpl asi;

	@PostMapping("/")
	public void addEmployee() {
		esi.addEmployee();
	}

	/*
	 * @GetMapping("/findall") public ArrayList<Employee> getAllEmployee() { return
	 * esi.findAllEmployees(); }
	 */
	@GetMapping("/findbyid/{id_employee}")
	public Employee getEmployeeUsingId(@PathVariable long id_employee) {
		return esi.findAllEmployeeByID(id_employee);
	}

	@DeleteMapping("/delete")
	public void delete() {
		esi.deleteAllData();
	}

	/////////////////
	@GetMapping("/findbyid/{id_authors}")
	public Author getAuthorUsingId(@PathVariable Long id_authors) {
		return asi.findAllAuthorById(id_authors);
	}

}