package com.BlogSystem.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_employee")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "con_employee")
	private Long codigo;
	@Column(name = "lastName")
	private String lastName;
	@Column(name = "firstName")
	private String firstName;
	@Column(name = "dateOfBirth")
	private Date dateOfBirth;
	@OneToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "id_address")
	private Address address;

	public Employee() {
	}

	public Employee(Long codigo, String lastName, String firstName, Date dateOfBirth) {
		this.codigo = codigo;
		this.lastName = lastName;
		this.firstName = firstName;
		this.dateOfBirth = dateOfBirth;
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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Address getAddress() {
		return address;
	}

	public void setAdress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [codigo=" + codigo + ", lastName=" + lastName + ", firstName=" + firstName
				+ ", fechaNacimiento=" + dateOfBirth + "]";
	}

}
