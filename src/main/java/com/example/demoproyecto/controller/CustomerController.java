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

import com.example.demoproyecto.model.Customer;
import com.example.demoproyecto.service.api.CustomerServiceAPI;

@RestController
@RequestMapping(value="/api/v2/")
@CrossOrigin("*")

public class CustomerController {

	@Autowired
	private CustomerServiceAPI customerServiceApi;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("list",customerServiceApi.getAll());
		return "index";
	}
	
	@GetMapping("/save/id")
	public String showSave(@PathVariable("id") Long id, Model model) {
		if(id!= null) {
			model.addAttribute("customer", customerServiceApi.get(id));
		}else {
			 model.addAttribute("customer", new Customer());
		 }
		return "save";
	}
	
	@PostMapping("/save/id")
	public String save(Customer customer, Model model) {
		customerServiceApi.save(customer);
		
		return "redirect:/";
	}
	
	public String delete(@PathVariable Long id, Model model) {
		customerServiceApi.delete(id);
		return "redirect:/";
	}
	
	
}
