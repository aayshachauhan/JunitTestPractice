package com.zee.kansoft.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zee.kansoft.entity.Person;

@Service
public interface PersonService {
	
	public List<Person> getAllPerson();

	public Boolean isPersonExistsById(Integer id);
}
