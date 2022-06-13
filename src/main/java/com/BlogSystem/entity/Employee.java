package com.BlogSystem.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_employee")
public class Employee/* implements Serializable */ {
	// private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id_employee")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;
	@Column(name = "lastName")
	private String lastName;
	@Column(name = "firstName")
	private String firstName;
	@Column(name = "email")
	private String email;
	@OneToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "id_address")
	private Address address;

	public Employee() {
	}

	public Employee(String lastName, String firstName, String email) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.email = email;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAdress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [codigo=" + codigo + ", lastName=" + lastName + ", firstName=" + firstName + ", email=" + email
				+ "]";
	}

}
