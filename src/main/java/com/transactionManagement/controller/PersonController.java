package com.transactionManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transactionManagement.model.Person;
import com.transactionManagement.services.PersonService;

@RestController
@RequestMapping("/api")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/save")
    public ResponseEntity<String> savePerson(@RequestBody Person request) {
        String response = personService.savePerson(request);
        return ResponseEntity.ok("sucess");

    }

}
