package com.example.demoproyecto.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoproyecto.model.Employee;
import com.example.demoproyecto.service.api.EmployeeServiceAPI;


@RestController
@RequestMapping(value = "/api/v1/")
@CrossOrigin("*")
public class EmployeeRestController {

    @Autowired
    private EmployeeServiceAPI employeeServiceAPI;

    @GetMapping(value = "/all")
    public List<Employee> getAll() {
        return employeeServiceAPI.getAll();
    }

    @GetMapping(value = "/find/{id}")
    public Employee find(@PathVariable Long id) {
        return employeeServiceAPI.get(id);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<Employee> save(@RequestBody Employee employee) {    	
    	Employee obj = employeeServiceAPI.save(employee);
        return new ResponseEntity<Employee>(obj, HttpStatus.OK);
    }

    @GetMapping(value = "/delete/{id}")
    public ResponseEntity<Employee> delete(@PathVariable Long id) {
    	Employee employee = employeeServiceAPI.get(id);
        if (employee != null) {
        	employeeServiceAPI.delete(id);
        }else {
            return new ResponseEntity<Employee>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<Employee>(employee, HttpStatus.OK);
    }

}