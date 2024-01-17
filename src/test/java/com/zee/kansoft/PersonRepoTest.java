package com.zee.kansoft;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.zee.kansoft.entity.Person;
import com.zee.kansoft.repository.PersonRepo;

@SpringBootTest
class PersonRepoTest {

	@Autowired PersonRepo personRepo;
	
    @Test
    void existsByPersonId() {
    	
    	Person person = new Person(1,"Ayesha","Delhi");
    	personRepo.save(person);
    	
    	Boolean actualResult= personRepo.existsByPersonId(1);
    	
    	assertThat(actualResult).isTrue();
    }

    @BeforeEach
	void setUp() {

    	System.out.println("Setting Up");
	}
    
    //If we want to delete all test cases then use tear down and in this method use delete all
	@AfterEach
	void tearDown() {

		System.out.println("Tearing Down");
		personRepo.deleteAll();
	}

	
}