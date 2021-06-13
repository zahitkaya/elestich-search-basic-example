package com.example.demo.repository;

import com.example.demo.Model.Person;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface PersonRepository extends ElasticsearchRepository<Person,String> {

    public Person getPersonByIdLike(String id);
}

