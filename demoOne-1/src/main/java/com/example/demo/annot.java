package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class annot {
  
	@Value("${value:shelbii}")
	private String name;
	 
	@GetMapping("/")
	public String display() {
		return "Welcome "+name;
	}
}
