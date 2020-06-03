package com.example.demoproyecto.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demoproyecto.commons.GenericServiceImpl;
import com.example.demoproyecto.dao.api.EmpleadoDaoAPI;
import com.example.demoproyecto.dao.api.RelaCustomerTaskEmployeeDaoAPI;
import com.example.demoproyecto.model.Empleado;
import com.example.demoproyecto.model.RelaCustomerTaskEmployee;
import com.example.demoproyecto.service.api.EmpleadoServiceAPI;
import com.example.demoproyecto.service.api.RelaCustomerTaskEmployeeServiceApi;
@Service
public class RelaCustomerTaskEmployeeServiceImpl 
	extends GenericServiceImpl <RelaCustomerTaskEmployee, Long> 
	implements RelaCustomerTaskEmployeeServiceApi {

	@Autowired
	private RelaCustomerTaskEmployeeDaoAPI relaCustomerTaskEmployeeDaoAPI;
	
	@Override
	public CrudRepository <RelaCustomerTaskEmployee, Long> getDao(){
		return relaCustomerTaskEmployeeDaoAPI;
	}
}

