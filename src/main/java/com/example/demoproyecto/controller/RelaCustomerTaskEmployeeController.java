package com.example.demoproyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoproyecto.model.RelaCustomerTaskEmployee;
import com.example.demoproyecto.service.api.RelaCustomerTaskEmployeeServiceApi;


@RestController
@RequestMapping(value="/api/v4/")
@CrossOrigin("*")

@Controller
public class RelaCustomerTaskEmployeeController {
	
	private RelaCustomerTaskEmployeeServiceApi relaCustomerTaskEmployeeServiceApi;
	
	@RequestMapping("/")
	 public String index(Model model) {
		 model.addAttribute("list", relaCustomerTaskEmployeeServiceApi.getAll());
		 return "index"; 
	 }
	 
	 @GetMapping("/save/{id}")
	 public String showSave(@PathVariable("id") Long id, Model model) {
		 if(id != null) {
			 model.addAttribute("relaCustomerTaskEmployee", relaCustomerTaskEmployeeServiceApi.get(id));
		 }else {
			 model.addAttribute("relaCustomerTaskEmployee", new RelaCustomerTaskEmployee());
		 }
		 return "save"; 
		 
	  }
	 
	 @PostMapping("/save")
	 public String save(RelaCustomerTaskEmployee relaCustomerTaskEmployee, Model model) {
		 relaCustomerTaskEmployeeServiceApi.save(relaCustomerTaskEmployee);
		 return "redirect:/";
		 
	 }
	 
	 public String delete(@PathVariable Long id, Model model) {
		 relaCustomerTaskEmployeeServiceApi.delete(id);
		 return "redirect:/"; 
	  }

}
