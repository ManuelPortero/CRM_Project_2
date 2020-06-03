package com.example.demoproyecto.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RelaCustomerTaskEmployee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column
	private Long IdEmployee;
	
	@Column
	private Long IdCustomer;
	
	@Column
	private Long IdTask;
	
	@Column
	private LocalDateTime Date;
	
	@Column
	private String Description;
	
	@Column
	private float ValueHours;
	
	
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

	public Long getIdCustomer() {
		return IdCustomer;
	}

	public void setIdCustomer(Long idCustomer) {
		IdCustomer = idCustomer;
	}

	public Long getIdTask() {
		return IdTask;
	}

	public void setIdTask(Long idTask) {
		IdTask = idTask;
	}

	public LocalDateTime getDate() {
		return Date;
	}

	public void setDate(LocalDateTime date) {
		Date = date;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public float getValueHours() {
		return ValueHours;
	}

	public void setValueHours(float valueHours) {
		ValueHours = valueHours;
	}

	
	
	
}
