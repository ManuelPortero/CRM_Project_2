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
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
		
	@Column
	private String dni;
	
	@Column 
	private String name;
	
	@Column 
	private String surname; 
	
	@Column
	private String position;
	
	@Column 
	private String userlogin;
	
	@Column
	private String pass;
	
	public Long getId() {
		return id;
	}

	public void setId(Long idp) {
		id = idp;
	}

	public String getDni() {
		return dni;
	}
	public void setDni(String dni1) {
		dni=dni1; 
	}
	
	public String getNombre() {
		return name;
	}

	public void setNombre(String nombre) {
		name = nombre;
	}

	public String getApellido() {
		return surname;
	}

	public void setApellido(String apellido) {
		surname = apellido;
	}

	public String getCargo() {
		return position;
	}

	public void setCargo(String cargo) {
		position = cargo;
	}

	public String getUserLogin() {
		return userlogin;
	}

	public void setUserLogin(String userLogin) {
		userlogin = userLogin;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass1) {
		pass = pass1;
	}

	
	
	
}
