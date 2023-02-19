package org.example;

public class One {

    package com.codility.tasks.hibernate.solution;

import org.springframework.stereotype.Service;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

    @Entity
    @Table(name= "person_data")
    class Person {

        @Id
        private Long id;

        private String firstName;
        private String lastName;

        public String getFullName() {
            return getFirstName() + " " + getLastName();
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public void setFirstName(String firstName){
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    }

    @Service
    class PersonService {

        @Autowired
        PersonRepository personRepository;

        List<Person> findAll() {
            return PersonRepository.findAll();
        }

    }

    @Repository
    interface PersonRepository extends JpaRepository<Person, Long> {}

}



}