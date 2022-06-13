package com.BlogSystem.service.implement;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BlogSystem.entity.Employee;
import com.BlogSystem.repository.EmployeeRepository;
import com.BlogSystem.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository eRepos;

	/*
	 * @Override public ArrayList<Employee> findAllEmployees() { return
	 * (ArrayList<Employee>) eRepos.findAll(); }
	 */
	@Override
	public Employee findAllEmployeeByID(long id_employee) {
		Optional<Employee> opt = eRepos.findById(id_employee);
		if (opt.isPresent())
			return opt.get();
		else
			return null;
	}

	@Override
	public void addEmployee() {
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee("EHM", "Huerta", "ed.huerta@edhmcorp.com"));
		emp.add(new Employee("Delhi", "Puneet", "delhi@edhmcorp.com"));
		emp.add(new Employee("Pune", "Abhay", "pune@edhmcorp.com"));
		emp.add(new Employee("Noida", "Anurag", "noid@edhmcorp.com"));
		for (Employee employee : emp) {
			eRepos.save(employee);
		}
	}

	@Override
	public void deleteAllData() {
		eRepos.deleteAll();

	}

}
