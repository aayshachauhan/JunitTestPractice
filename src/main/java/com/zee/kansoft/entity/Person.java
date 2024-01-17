package com.zee.kansoft.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "person")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="person_id")
	private Integer personId;

	@Column(name ="person_name")
	private String personName;

	@Column(name ="person_city")
	private String personCity;
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(Integer personId, String personName, String personCity) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personCity = personCity;
	}

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonCity() {
		return personCity;
	}

	public void setPersonCity(String personCity) {
		this.personCity = personCity;
	}
	
	


}
