package com.zee.kansoft.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zee.kansoft.entity.Person;
import com.zee.kansoft.repository.PersonRepo;
import com.zee.kansoft.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService{

	@Autowired
	private PersonRepo repo;
	
	public PersonServiceImpl(PersonRepo repo) {

		this.repo=repo;
	}

	@Override
	public List<Person> getAllPerson() {
		
		return this.repo.findAll();
	}

	@Override
	public Boolean isPersonExistsById(Integer id) {

        return repo.existsByPersonId(id);
	}

}
