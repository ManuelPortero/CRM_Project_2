package com.example.demoproyecto.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demoproyecto.commons.GenericServiceImpl;
import com.example.demoproyecto.dao.api.RoleDaoAPI;
import com.example.demoproyecto.model.Role;
import com.example.demoproyecto.service.api.RoleServiceApi;
@Service
public class RoleServiceImpl extends GenericServiceImpl<Role,Long> implements RoleServiceApi {

	@Autowired
	private RoleDaoAPI roleDaoApi;
	
	@Override
	public CrudRepository <Role, Long> getDao(){
		return roleDaoApi;
	}
}
