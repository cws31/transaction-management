package com.transactionManagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transactionManagement.model.Person;
import com.transactionManagement.model.Vote;

public interface VoteRepository extends JpaRepository<Vote, Long> {

}
