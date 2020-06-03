package com.example.demoproyecto.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demoproyecto.commons.GenericServiceImpl;
import com.example.demoproyecto.dao.api.CustomerDaoAPI;
import com.example.demoproyecto.model.Customer;
import com.example.demoproyecto.service.api.CustomerServiceAPI;


@Service
public class CustomerServiceImpl extends GenericServiceImpl <Customer, Long> implements CustomerServiceAPI {

	@Autowired
	private CustomerDaoAPI customerDaoApi; 
	
	@Override
	public CrudRepository<Customer, Long> getDao() {
		// TODO Auto-generated method stub
		return customerDaoApi;
	}
}
