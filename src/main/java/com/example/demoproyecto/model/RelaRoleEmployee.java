package com.example.demoproyecto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RelaRoleEmployee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;	
	
	@Column
	private Long IdRole;
	
	@Column
	private Long IdEmployee;
	
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Long getIdRole() {
		return IdRole;
	}

	public void setIdRole(Long idRole) {
		IdRole = idRole;
	}

	public Long getIdEmployee() {
		return IdEmployee;
	}

	public void setIdEmployee(Long idEmployee) {
		IdEmployee = idEmployee;
	}

	
}
