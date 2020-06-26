package com.example.demoproyecto.model;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column
	private int IdCustomer;
	
	@Column
	private String Name;
	
	@Column
	private String Company;
	
	@Column
	private String Adress;
	
	@Column
	private String City;
	
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public int getIdCustomer() {
		return IdCustomer;
	}

	public void setIdCustomer(int idCustomer) {
		IdCustomer = idCustomer;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

	public String getAdress() {
		return Adress;
	}

	public void setAdress(String adress) {
		Adress = adress;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	
	
	
}
