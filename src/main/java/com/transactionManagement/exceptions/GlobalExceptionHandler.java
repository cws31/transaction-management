
package com.transactionManagement.exceptions;

import java.time.LocalDate;
import java.util.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(AgeLimitException.class)
    public ResponseEntity<Map<String, Object>> agelimintExceptionHandler(Exception ex) {

        Map<String, Object> response = new HashMap<>();
        response.put("message", ex.getMessage());
        response.put("error", "age should be > 18");
        response.put("status", HttpStatus.BAD_REQUEST);
        response.put("timestamp", LocalDate.now());

        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);

    }

}
