package com.example.demoproyecto.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demoproyecto.commons.GenericServiceImpl;
import com.example.demoproyecto.dao.api.RelaRoleEmployeeDaoAPI;
import com.example.demoproyecto.dao.api.RelaTaskEmployeeDaoAPI;
import com.example.demoproyecto.model.RelaRoleEmployee;
import com.example.demoproyecto.service.api.RelaRoleEmployeeServiceApi;
import com.example.demoproyecto.service.api.RelaTaskEmployeesServiceApi;
import com.example.demoproyecto.model.RelaTaskEmployees;

@Service
public class RelaTaskEmployeesServiceImpl extends GenericServiceImpl <RelaTaskEmployees, Long> implements RelaTaskEmployeesServiceApi{

	@Autowired
	private RelaTaskEmployeeDaoAPI relaTaskEmployeeDaoApi;
	
	@Override
	public CrudRepository<RelaTaskEmployees, Long> getDao(){
		return relaTaskEmployeeDaoApi;
	
	}
}
