<<<<<<< HEAD:src/main/java/com/example/demoproyecto/controller/EmpleadoController.java
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
=======
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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoproyecto.model.Employee;
import com.example.demoproyecto.service.api.EmployeeServiceAPI;
/*@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.HEAD,RequestMethod.DELETE, 
RequestMethod.POST,RequestMethod.TRACE	
})*/
@CrossOrigin("*")
@RestController
@RequestMapping(value="/api/v1/")


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
	 if(empleado.getId()==null) {
		 long idp= (long)Math.floor(Math.random()*1000);
		 empleado.setId(idp);
	 }
	 empleadoServiceAPI.save(empleado);
	 return "redirect:/";
	 
 }
 
 @GetMapping("/delete/{id}")
 public String delete(@PathVariable Long id, Model model) {
	 empleadoServiceAPI.delete(id);
	 return "redirect:/"; 
  }
}
>>>>>>> 6c523bf68ab2fa370fe49b302acfdc90dfb0e099:src/main/java/com/example/demoproyecto/controller/EmployeeController.java
