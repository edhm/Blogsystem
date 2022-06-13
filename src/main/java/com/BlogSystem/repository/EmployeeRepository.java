package com.BlogSystem.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BlogSystem.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	// ArrayList<Employee> findAllEmployee(); Error al definirlo
	// ArrayList<Employee> findAllEmployees();
}
