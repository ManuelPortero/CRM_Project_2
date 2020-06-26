<<<<<<< HEAD
package com.example.demoproyecto.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demoproyecto.commons.GenericServiceImpl;
import com.example.demoproyecto.model.Empleado;
import com.example.demoproyecto.service.api.EmpleadoServiceAPI;
import com.example.demoproyecto.dao.api.EmpleadoDaoAPI;

@Service
public class EmpleadoServiceImpl extends GenericServiceImpl <Empleado, Long> implements EmpleadoServiceAPI {
	@Autowired
	private EmpleadoDaoAPI empleadoDaoAPI; 
	
	@Override
	public CrudRepository<Empleado, Long> getDao() {
		// TODO Auto-generated method stub
		return empleadoDaoAPI;
	}

}
=======
package com.example.demoproyecto.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demoproyecto.commons.GenericServiceImpl;
import com.example.demoproyecto.model.Employee;
import com.example.demoproyecto.service.api.EmployeeServiceAPI;
import com.example.demoproyecto.dao.api.EmployeeDaoAPI;

@Service
public class EmpleadoServiceImpl extends GenericServiceImpl <Employee, Long> implements EmployeeServiceAPI {
	@Autowired
	private EmployeeDaoAPI empleadoDaoAPI; 
	
	@Override
	public CrudRepository<Employee, Long> getDao() {
		// TODO Auto-generated method stub
		return empleadoDaoAPI;
	}

}
>>>>>>> 6c523bf68ab2fa370fe49b302acfdc90dfb0e099
