package com.BlogSystem.service.implement;

import java.util.ArrayList;
import java.util.Optional;

import org.hibernate.validator.internal.util.privilegedactions.IsClassPresent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BlogSystem.entity.Author;
import com.BlogSystem.repository.AuthorRepository;
import com.BlogSystem.repository.implement.AuthorRepositoryImpl;
import com.BlogSystem.service.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService {
	@Autowired
	AuthorRepository authorRepository;

	@Override
	public Author findAllAuthorById(Long id_authors) {
		Optional<Author> opt = authorRepository.findById(id_authors);
		if (opt.isPresent())
			return opt.get();
		else
			return null;
	}

	@Override
	public void addAuthor() {
		ArrayList<Author> auth = new ArrayList<Author>();
		auth.add(new Author("Armando", "Venero", "Peruvian"));
		auth.add(new Author("Juan", "Espinoza", "Peruvian"));
		auth.add(new Author("Dolfh", "Lungrep", "Ucarnia"));
		auth.add(new Author("van", "Drago", "Rusia"));
		auth.add(new Author("Lauri", "Passini", "Italiano"));
		for (Author author : auth) {
			authorRepository.save(author);
		}

	}

	@Override
	public void deleteAllData() {
		authorRepository.deleteAll();

	}

}
