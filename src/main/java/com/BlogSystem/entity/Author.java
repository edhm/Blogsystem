package com.BlogSystem.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_authors")
public class Author {
	@Id
	@Column(name = "id_authors")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "firstName")
	private String firstName;
	@Column(name = "lastName")
	private String lastName;
	@Column(name = "nationality")
	private String nationality;
	@OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
	private List<BooksEntity> books = new ArrayList<>();

	public Author(String firstName, String lastName, String nationality) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.nationality = nationality;
	}

	public Author() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public List<BooksEntity> getBooks() {
		return books;
	}

	public void setBooks(List<BooksEntity> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", nationality="
				+ nationality + "]";
	}

}
