package com.example.demoproyecto.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.example.demoproyecto.commons.GenericServiceImpl;
import com.example.demoproyecto.dao.api.RoleDaoAPI;
import com.example.demoproyecto.dao.api.TaskDaoAPI;
import com.example.demoproyecto.model.Role;
import com.example.demoproyecto.model.Task;
import com.example.demoproyecto.service.api.TaskServiceAPI;

public class TaskServiceImpl extends GenericServiceImpl<Task,Long> implements TaskServiceAPI {
	
	@Autowired
	private TaskDaoAPI taskDaoApi;
	
	@Override
	public CrudRepository <Task, Long> getDao(){
		return taskDaoApi;
	}
	
}
