package com.nwa.tutorial.jpa.jpatutorial;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    Optional<Customer> findById(Long id);

    Iterable<Object> findByLastName(String lastname);
}