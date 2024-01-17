package com.zee.kansoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.zee.kansoft.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@GetMapping("/persons")
	public ResponseEntity<?> getAllPerson(){
		
		return ResponseEntity.ok(personService.getAllPerson());
	}
	
	@GetMapping("/person/exist/{id}")
	public ResponseEntity<?> isPersonExistById(@PathVariable Integer id){
		
		return ResponseEntity.ok(personService.isPersonExistsById(id));
	}

}
