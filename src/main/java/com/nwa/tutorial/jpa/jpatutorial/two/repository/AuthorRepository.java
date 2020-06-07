package com.nwa.tutorial.jpa.jpatutorial.two.repository;

import com.nwa.tutorial.jpa.jpatutorial.two.model.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Integer> {
}
