package com.example.javaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RestController;  
import org.springframework.web.bind.annotation.GetMapping; 

@RestController  
@SpringBootApplication
public class JavaapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaapiApplication.class, args);
	}
	
	@GetMapping("/api")  
	private String getAllBooks()   
	{  
	return "deployed sucessfully first image";  
	}  

}
