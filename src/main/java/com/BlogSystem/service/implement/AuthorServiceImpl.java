package com.BlogSystem.service.implement;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BlogSystem.entity.Author;
import com.BlogSystem.repository.AuthorRepository;
import com.BlogSystem.service.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService {
	@Autowired
	AuthorRepository aRepos;

	@Override
	public Author findAllAuthorByID(long id_authors) {
		Optional<Author> opt = aRepos.findById(id_authors);
		if (opt.isPresent())
			return opt.get();
		else
			return null;
	}

	@Override
	public void addAuthor() {
		ArrayList<Author> aut = new ArrayList<Author>();
		aut.add(new Author("Armando", "Venero", "Peruvian"));
		aut.add(new Author("Carlos", "Hurtado", "French"));
		aut.add(new Author("Miguel", "Miranda", "German"));
		aut.add(new Author("Chris", "Richardson", "Canadian"));
		for (Author author : aut) {
			aRepos.save(author);
		}
	}

	@Override
	public void deleteAllData() {
		aRepos.deleteAll();

	}

}
