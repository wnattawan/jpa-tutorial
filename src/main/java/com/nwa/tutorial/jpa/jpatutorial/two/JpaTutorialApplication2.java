package com.nwa.tutorial.jpa.jpatutorial.two;

import com.nwa.tutorial.jpa.jpatutorial.two.model.Employee;
import com.nwa.tutorial.jpa.jpatutorial.two.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaTutorialApplication2 {
    private static final Logger log = LoggerFactory.getLogger(JpaTutorialApplication2.class);

    public static void main(String[] args) {
        SpringApplication.run(JpaTutorialApplication2.class, args);
    }

    @Bean
    public CommandLineRunner demo(EmployeeRepository repository) {
        return (args) -> {
            // save an employee
            repository.save(new Employee("Christ", 40000, "Technical Manager"));

            // fetch all employees
            log.info("Employees found with findAll():");
            log.info("-------------------------------");
            for (Employee employee : repository.findAll()) {
                log.info(employee.toString());
            }
            log.info("");

            // fetch an individual employee by ID
            Employee employee = repository.findById(1).orElseThrow(
                    () -> new EmployeeNotFoundException("No employee found with id 1")
            );

            log.info("Employee found with findById(1L):");
            log.info("--------------------------------");
            log.info(employee.toString());
            log.info("");

        };
    }
}
