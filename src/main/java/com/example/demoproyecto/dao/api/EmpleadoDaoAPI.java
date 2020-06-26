package com.example.demoproyecto.dao.api;

import org.springframework.data.repository.CrudRepository;

import com.example.demoproyecto.model.Empleado;

public interface EmpleadoDaoAPI extends CrudRepository<Empleado, Long> {

}
