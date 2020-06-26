package com.example.demoproyecto.dao.api;
import org.springframework.data.repository.CrudRepository;

import com.example.demoproyecto.model.RelaCustomerEmployee;
import com.example.demoproyecto.model.RelaCustomerTaskEmployee;



public interface RelaCustomerEmployeeDaoAPI extends CrudRepository<RelaCustomerEmployee, Long> {

}
