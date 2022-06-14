package com.BlogSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BlogSystem.entity.BooksEntity;

@Repository
public interface BooksRepository extends JpaRepository<BooksEntity, Long> {

}
