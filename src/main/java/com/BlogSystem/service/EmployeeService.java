package com.BlogSystem.service;

import java.util.ArrayList;

import com.BlogSystem.entity.Employee;

public interface EmployeeService {
	//ArrayList<Employee> findAllEmployees();

	Employee findAllEmployeeByID(long id);

	void addEmployee();

	void deleteAllData();
}
