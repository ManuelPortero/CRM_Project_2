package com.example.demoproyecto.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demoproyecto.commons.GenericServiceImpl;
import com.example.demoproyecto.dao.api.RelaRoleEmployeeDaoAPI;
import com.example.demoproyecto.model.RelaRoleEmployee;
import com.example.demoproyecto.service.api.RelaRoleEmployeeServiceApi;

@Service
public class RelaRoleEmployeeServiceImpl extends GenericServiceImpl <RelaRoleEmployee, Long> implements RelaRoleEmployeeServiceApi{

	@Autowired
	private RelaRoleEmployeeDaoAPI relaRoleEmployeeDaoApi;
	
	@Override
	public CrudRepository<RelaRoleEmployee, Long> getDao(){
		return relaRoleEmployeeDaoApi;
	}
	
	
	
}

