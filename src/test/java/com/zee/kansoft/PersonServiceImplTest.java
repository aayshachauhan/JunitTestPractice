package com.zee.kansoft;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.zee.kansoft.repository.PersonRepo;
import com.zee.kansoft.service.Impl.PersonServiceImpl;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
class PersonServiceImplTest {
	
	@Mock
	PersonRepo personRepo;
	

	PersonServiceImpl personServiceImpl;

	@BeforeEach
    void setUp() {
    	
    	this.personServiceImpl = new PersonServiceImpl(this.personRepo);
        
    }
	
    @Test
    void getAllPerson() {
    	
    	personServiceImpl.getAllPerson();
    	verify(personRepo).findAll();
    }

    
}