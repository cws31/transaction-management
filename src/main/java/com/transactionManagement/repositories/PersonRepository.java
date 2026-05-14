package com.transactionManagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transactionManagement.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
