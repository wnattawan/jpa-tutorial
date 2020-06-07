package com.nwa.tutorial.jpa.jpatutorial.two.repository;

import com.nwa.tutorial.jpa.jpatutorial.two.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}
