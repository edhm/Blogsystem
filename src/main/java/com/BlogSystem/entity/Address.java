package com.BlogSystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_address")
public class Address {
	@Id
	@Column(name = "id_address")
	private Long id;
	@Column(name = "address")
	private String address;
	@Column(name = "location")
	private String location;
	@Column(name = "province")
	private String province;
	@Column(name = "countrie")
	private String countrie;
	@OneToOne(mappedBy = "address", fetch = FetchType.LAZY)
	private Employee employee;

	public Address() {
	}

	public Address(Long id, String address, String location, String province, String countrie) {
		this.id = id;
		this.address = address;
		this.location = location;
		this.province = province;
		this.countrie = countrie;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCountrie() {
		return countrie;
	}

	public void setCountrie(String countrie) {
		this.countrie = countrie;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", address=" + address + ", location=" + location + ", province=" + province
				+ ", countrie=" + countrie + ", employee=" + employee.getCodigo() + "]";
	}

}
