package com.example.demoproyecto.dao.api;

import org.springframework.data.repository.CrudRepository;


import com.example.demoproyecto.model.Employee;

public interface EmployeeDaoAPI extends CrudRepository<Employee, Long> {

}
