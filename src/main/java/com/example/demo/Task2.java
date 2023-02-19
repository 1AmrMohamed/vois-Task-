package org.example;

public class two {

    package com.codility.exceptionhandling;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

    // This class can be modified
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public class TaskNotFound extends RuntimeException {
        public TaskNotFound(Long id) {
            super("Task with id: " + id + " not found.");
        }
    }

}