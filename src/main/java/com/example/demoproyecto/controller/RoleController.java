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

import com.example.demoproyecto.model.Role;
import com.example.demoproyecto.service.api.RoleServiceApi;

@RestController
@RequestMapping(value="/api/v5/")
@CrossOrigin("*")

@Controller
public class RoleController {
	@Autowired
	private RoleServiceApi roleServiceApi;
	
	
	@RequestMapping("/")
	 public String index(Model model) {
		 model.addAttribute("list", roleServiceApi.getAll());
		 return "index"; 
	 }
	 
	 @GetMapping("/save/{id}")
	 public String showSave(@PathVariable("id") Long id, Model model) {
		 if(id != null) {
			 model.addAttribute("role", roleServiceApi.get(id));
		 }else {
			 model.addAttribute("role", new Role());
		 }
		 return "save"; 
		 
	  }
	 
	 @PostMapping("/save")
	 public String save(Role role, Model model) {
		 roleServiceApi.save(role);
		 return "redirect:/";
		 
	 }
	 
	 public String delete(@PathVariable Long id, Model model) {
		 roleServiceApi.delete(id);
		 return "redirect:/"; 
	  }

}
