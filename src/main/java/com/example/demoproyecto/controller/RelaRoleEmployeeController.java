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
import com.example.demoproyecto.model.Role;
import com.example.demoproyecto.service.api.RelaRoleEmployeeServiceApi;

@RestController
@RequestMapping(value="/api/v5/")
@CrossOrigin("*")

@Controller
public class RelaRoleEmployeeController {

	@Autowired
	private RelaRoleEmployeeServiceApi relaRoleEmployeeServiceApi;
	
	@RequestMapping("/")
	 public String index(Model model) {
		 model.addAttribute("list", relaRoleEmployeeServiceApi.getAll());
		 return "index"; 
	 }
	 
	 @GetMapping("/save/{id}")
	 public String showSave(@PathVariable("id") Long id, Model model) {
		 if(id != null) {
			 model.addAttribute("roleEmployee", relaRoleEmployeeServiceApi.get(id));
		 }else {
			 model.addAttribute("roleEmployee", new Role());
		 }
		 return "save"; 
		 
	  }
	 
	 @PostMapping("/save")
	 public String save(RelaRoleEmployee roleEmployee, Model model) {
		 relaRoleEmployeeServiceApi.save(roleEmployee);
		 return "redirect:/";
		 
	 }
	 
	 public String delete(@PathVariable Long id, Model model) {
		 relaRoleEmployeeServiceApi.delete(id);
		 return "redirect:/"; 
	  }
	
}
