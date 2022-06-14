package com.BlogSystem.service.implement;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BlogSystem.entity.BooksEntity;
import com.BlogSystem.repository.BooksRepository;
import com.BlogSystem.service.BooksService;

@Service
public class BooksServiceImpl implements BooksService {
	@Autowired
	BooksRepository bRepos;

	@Override
	public BooksEntity findAllBooksByID(long id_books) {
		Optional<BooksEntity> opt = bRepos.findById(id_books);
		if (opt.isPresent())
			return opt.get();
		else
			return null;
	}

	@Override
	public void addBooks() {
		ArrayList<BooksEntity> bok = new ArrayList<BooksEntity>();
		bok.add(new BooksEntity("Analisis Matemático I"));
		bok.add(new BooksEntity("Cáculo II"));
		bok.add(new BooksEntity("Transformada de Laplace"));
		bok.add(new BooksEntity("Cálculo Vetorial"));
		bok.add(new BooksEntity("Cálculo Complejo"));
		for (BooksEntity book : bok) {
			bRepos.saveAll(bok);
		}
	}

	@Override
	public void deleteBooks() {
		bRepos.deleteAll();

	}

}
