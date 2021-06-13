package com.example.demo.controller;

import com.example.demo.Model.Person;
import com.example.demo.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.time.Period;

@RestController
@RequestMapping("api/v1/persons")
@RequiredArgsConstructor
public class PersonController {

    final PersonRepository personRepository;

    @PostConstruct
    void loadData(){
        Person person=Person.builder()
                .id("P1844")
                .name("Zahit")
                .build();
        personRepository.save(person);
    }

    @GetMapping("/{id}")
    public Person getPersonById(@PathVariable String id){
        return personRepository.getPersonByIdLike(id);
    }

}
