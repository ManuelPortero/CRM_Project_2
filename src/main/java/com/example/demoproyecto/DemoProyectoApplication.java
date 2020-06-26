
package com.example.demoproyecto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
@Configuration
@EnableWebMvc
@CrossOrigin(origins = "https://localhost:3000", maxAge = 3600)
@SpringBootApplication
public class DemoProyectoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoProyectoApplication.class, args);
		
	}

}


