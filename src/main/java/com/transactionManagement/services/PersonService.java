package com.transactionManagement.services;

import org.springframework.stereotype.Service;

import com.transactionManagement.exceptions.AgeLimitException;
import com.transactionManagement.model.Person;
import com.transactionManagement.model.Vote;
import com.transactionManagement.repositories.PersonRepository;
import com.transactionManagement.repositories.VoteRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PersonService {

    private final PersonRepository personRepository;
    private final VoteRepository voteRepository;

    @Transactional
    public String savePerson(Person request) {
        Person person = new Person();
        person.setAge(request.getAge());
        person.setName(request.getName());

        Person savedPerson = personRepository.save(person);

        if (savedPerson.getAge() < 18) {
            throw new AgeLimitException("aga should be greter than of 18");
        }
        Vote vote = new Vote();
        vote.setMessage("person can vote");
        Vote saVote = voteRepository.save(vote);

        return "method executed successfully";
    }

}
