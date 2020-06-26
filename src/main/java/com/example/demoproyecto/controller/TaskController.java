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
import com.example.demoproyecto.model.Task;
import com.example.demoproyecto.service.api.RoleServiceApi;
import com.example.demoproyecto.service.api.TaskServiceAPI;

@RestController
@RequestMapping (value="/api/v8/")
@CrossOrigin("*")

@Controller
public class TaskController {
	@Autowired
	private TaskServiceAPI taskServiceApi;
	
	
	@RequestMapping("/")
	 public String index(Model model) {
		 model.addAttribute("list", taskServiceApi.getAll());
		 return "index"; 
	 }
	 
	 @GetMapping("/save/{id}")
	 public String showSave(@PathVariable("id") Long id, Model model) {
		 if(id != null) {
			 model.addAttribute("task", taskServiceApi.get(id));
		 }else {
			 model.addAttribute("task", new Task());
		 }
		 return "save"; 
		 
	  }
	 
	 @PostMapping("/save")
	 public String save(Task task, Model model) {
		 taskServiceApi.save(task);
		 return "redirect:/";
		 
	 }
	 
	 public String delete(@PathVariable Long id, Model model) {
		 taskServiceApi.delete(id);
		 return "redirect:/"; 
	  }

}
