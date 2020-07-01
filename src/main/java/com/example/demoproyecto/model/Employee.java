package com.example.demoproyecto.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@Entity
public class Employee {
 
	/*@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)*/
	@Id	
	private Long id;
		
	@Column
	private String dni;
	
	@Column 
	private String name;
	
	@Column 
	private String surname; 
	
	@Column
    private String position;
	
	/*
	@Column
	private String userlogin;
	
	@Column 
	private String pass;
	*/

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}



}
