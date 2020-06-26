package com.example.demoproyecto.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Empleado {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
		
	@Column
	private String Dni;
	
	@Column 
	private String Nombre;
	
	@Column 
	private String Apellido; 
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getDni() {
		return Dni;
	}
	public void setDni(String dni) {
		Dni=dni; 
	}
	
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getCargo() {
		return Cargo;
	}

	public void setCargo(String cargo) {
		Cargo = cargo;
	}

	@Column 
	private String Cargo;
	
	
}
