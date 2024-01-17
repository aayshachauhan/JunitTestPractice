package com.zee.kansoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zee.kansoft.entity.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person, Integer>{

//	@Query("SELECT CASE WHEN COUNT(p) > 0 THEN TRUE ELSE FALSE END FROM Person p WHERE p.personId = :id")
//    Boolean isPersonExistsById(Integer id);
	Boolean existsByPersonId(Integer id);
}
