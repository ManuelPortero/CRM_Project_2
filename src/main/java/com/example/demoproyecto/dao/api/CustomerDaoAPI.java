package com.example.demoproyecto.dao.api;

import org.springframework.data.repository.CrudRepository;

import com.example.demoproyecto.model.Customer;

public interface CustomerDaoAPI extends CrudRepository<Customer, Long> {

}
