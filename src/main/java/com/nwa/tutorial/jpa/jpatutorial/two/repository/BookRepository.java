package com.nwa.tutorial.jpa.jpatutorial.two.repository;

import com.nwa.tutorial.jpa.jpatutorial.two.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {
}
