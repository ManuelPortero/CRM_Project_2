package com.example.demoproyecto.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demoproyecto.commons.GenericServiceImpl;
import com.example.demoproyecto.model.RelaCustomerEmployee;
import com.example.demoproyecto.service.api.RelaCustomerEmployeeServiceAPI;
import com.example.demoproyecto.dao.api.RelaCustomerEmployeeDaoAPI;
@Service
public class RelaCustomerEmployeeServiceImpl extends GenericServiceImpl <RelaCustomerEmployee, Long> implements RelaCustomerEmployeeServiceAPI {
	@Autowired
	private RelaCustomerEmployeeDaoAPI RelaCustomerEmployeeDaoAPI; 
	
	@Override
	public CrudRepository<RelaCustomerEmployee, Long> getDao() {
		// TODO Auto-generated method stub
		return RelaCustomerEmployeeDaoAPI;
	}
}
