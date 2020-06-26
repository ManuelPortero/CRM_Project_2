package com.example.demoproyecto.model;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RelaTaskEmployees {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column
	private Long IdEmployee;
	
	@Column
	private Long IdTask;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Long getIdEmployee() {
		return IdEmployee;
	}

	public void setIdEmployee(Long idEmployee) {
		IdEmployee = idEmployee;
	}

	public Long getIdTask() {
		return IdTask;
	}

	public void setIdTask(Long idTask) {
		IdTask = idTask;
	}
}
