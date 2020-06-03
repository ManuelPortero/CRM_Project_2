package com.example.demoproyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demoproyecto.model.Empleado;
import com.example.demoproyecto.service.api.EmpleadoServiceAPI;

@Controller
public class EmpleadoController {

 @Autowired
 private EmpleadoServiceAPI empleadoServiceAPI; 
	
 @RequestMapping("/")
 public String index(Model model) {
	 model.addAttribute("list", empleadoServiceAPI.getAll());
	 return "index"; 
 }
 
 @GetMapping("/save/{id}")
 public String showSave(@PathVariable("id") Long id, Model model) {
	 if(id != null) {
		 model.addAttribute("empleado", empleadoServiceAPI.get(id));
	 }else {
		 model.addAttribute("empleado", new Empleado());
	 }
	 return "save"; 
	 
  }
 
 @PostMapping("/save")
 public String save(Empleado empleado, Model model) {
	 empleadoServiceAPI.save(empleado);
	 return "redirect:/";
	 
 }
 
 public String delete(@PathVariable Long id, Model model) {
	 empleadoServiceAPI.delete(id);
	 return "redirect:/"; 
  }
}