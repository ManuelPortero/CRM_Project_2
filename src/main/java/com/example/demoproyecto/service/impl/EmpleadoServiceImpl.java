package com.example.demoproyecto.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demoproyecto.commons.GenericServiceImpl;
import com.example.demoproyecto.model.Employee;
import com.example.demoproyecto.service.api.EmployeeServiceAPI;
import com.example.demoproyecto.dao.api.EmployeeDaoAPI;

@Service
public class EmpleadoServiceImpl extends GenericServiceImpl<Employee, Long> implements EmployeeServiceAPI {
	@Autowired
	private EmployeeDaoAPI empleadoDaoAPI;

	@Override
	public CrudRepository<Employee, Long> getDao() {
		// TODO Auto-generated method stub
		return empleadoDaoAPI;
	}

}
