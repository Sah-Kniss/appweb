package com.example.appwebsenai.controller;

import com.example.appweb.model.Person;
import org.rootframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer > {
}