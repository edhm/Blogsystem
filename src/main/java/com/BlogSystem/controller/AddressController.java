package com.BlogSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BlogSystem.entity.AddressEntity;
import com.BlogSystem.entity.Author;
import com.BlogSystem.entity.Employee;
import com.BlogSystem.repository.AddressRepository;
import com.BlogSystem.service.implement.AddressServiceImpl;
import com.BlogSystem.service.implement.AuthorServiceImpl;
import com.BlogSystem.service.implement.EmployeeServiceImpl;

@RestController
public class AddressController {
	@Autowired
	AddressServiceImpl adsi;

	@PostMapping("/addaddress/")
	public void add() {
		adsi.addAdress();
	}

	@GetMapping("/findbyidaddress/{id_address}")
	public AddressEntity getAddressUsingByID(@PathVariable long id_address) {
		return adsi.findAllAddressByID(id_address);
	}

	@DeleteMapping("/deleteaddress")
	public void delete() {
		adsi.deleteAddress();
	}
}