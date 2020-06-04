package com.example.demoproyecto.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoproyecto.model.RelaRoleEmployee;
import com.example.demoproyecto.model.RelaTaskEmployees;
import com.example.demoproyecto.model.Role;
import com.example.demoproyecto.model.Task;
import com.example.demoproyecto.service.api.RelaRoleEmployeeServiceApi;
import com.example.demoproyecto.service.api.RelaTaskEmployeesServiceApi;

@RestController
@RequestMapping(value="/api/v6/")
@CrossOrigin("*")

@Controller
public class RelaTaskEmployeeController {
	@Autowired
	private RelaTaskEmployeesServiceApi relaTaskEmployeeServiceApi;
	
	@RequestMapping("/")
	 public String index(Model model) {
		 model.addAttribute("list", relaTaskEmployeeServiceApi.getAll());
		 return "index"; 
	 }
	 
	 @GetMapping("/save/{id}")
	 public String showSave(@PathVariable("id") Long id, Model model) {
		 if(id != null) {
			 model.addAttribute("taskEmployee", relaTaskEmployeeServiceApi.get(id));
		 }else {
			 model.addAttribute("taskEmployee", new Task());
		 }
		 return "save"; 
		 
	  }
	 
	 @PostMapping("/save")
	 public String save(RelaTaskEmployees roleEmployee, Model model) {
		 relaTaskEmployeeServiceApi.save(roleEmployee);
		 return "redirect:/";
		 
	 }
	 
	 public String delete(@PathVariable Long id, Model model) {
		 relaTaskEmployeeServiceApi.delete(id);
		 return "redirect:/"; 
	  }
	
}
