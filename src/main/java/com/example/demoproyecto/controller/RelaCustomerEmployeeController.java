package com.example.demoproyecto.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoproyecto.model.RelaCustomerEmployee;
import com.example.demoproyecto.model.RelaCustomerTaskEmployee;
import com.example.demoproyecto.service.api.RelaCustomerEmployeeServiceAPI;
import com.example.demoproyecto.service.api.RelaCustomerTaskEmployeeServiceApi;


@RestController
@RequestMapping(value="/api/v3/")
@CrossOrigin("*")

@Controller
public class RelaCustomerEmployeeController {


	private RelaCustomerEmployeeServiceAPI relaCustomerEmployeeServiceApi;
	
	@RequestMapping("/")
	 public String index(Model model) {
		 model.addAttribute("list", relaCustomerEmployeeServiceApi.getAll());
		 return "index"; 
	 }
	 
	 @GetMapping("/save/{id}")
	 public String showSave(@PathVariable("id") Long id, Model model) {
		 if(id != null) {
			 model.addAttribute("relaCustomerEmployee", relaCustomerEmployeeServiceApi.get(id));
		 }else {
			 model.addAttribute("relaCustomerEmployee", new RelaCustomerEmployee());
		 }
		 return "save"; 
		 
	  }
	 
	 @PostMapping("/save")
	 public String save(RelaCustomerEmployee relaCustomerEmployee, Model model) {
		 relaCustomerEmployeeServiceApi.save(relaCustomerEmployee);
		 return "redirect:/";
		 
	 }
	 
	 public String delete(@PathVariable Long id, Model model) {
		 relaCustomerEmployeeServiceApi.delete(id);
		 return "redirect:/"; 
	  }

	
	
}
