package com.bridgelabz.bookstoreapplicationbackend_spring.repository;

import com.bridgelabz.bookstoreapplicationbackend_spring.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<BookEntity, Long> {

	// To search if book with name exists
	Optional<BookEntity> findByBookName(String bookName);

}
