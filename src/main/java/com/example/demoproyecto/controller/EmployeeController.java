package com.example.demoproyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoproyecto.model.Employee;
import com.example.demoproyecto.service.api.EmployeeServiceAPI;
@RestController
@RequestMapping(value="/api/v1/")
@CrossOrigin("*")

@Controller
public class EmployeeController {

 @Autowired
 private EmployeeServiceAPI empleadoServiceAPI; 
	
 @RequestMapping("/")
 public String index(Model model) {
	 model.addAttribute("list", empleadoServiceAPI.getAll());
	 return "index"; 
 }
 @GetMapping("/all")
 public List<Employee> getAll(){
	 return empleadoServiceAPI.getAll();
 }
 
 @GetMapping("/save/{id}")
 public String showSave(@PathVariable("id") Long id, Model model) {
	 if(id != null) {
		 model.addAttribute("empleado", empleadoServiceAPI.get(id));
	 }else {
		 model.addAttribute("empleado", new Employee());
	 }
	 return "save"; 
	 
  }
 
 @PostMapping("/save")
 public String save(Employee empleado, Model model) {
	 empleadoServiceAPI.save(empleado);
	 return "redirect:/";
	 
 }
 
 public String delete(@PathVariable Long id, Model model) {
	 empleadoServiceAPI.delete(id);
	 return "redirect:/"; 
  }
}
