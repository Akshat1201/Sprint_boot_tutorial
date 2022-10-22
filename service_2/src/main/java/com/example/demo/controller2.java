package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service2")
public class controller2 {
	
	@GetMapping
	public String test2() {
		return "success for service 2";
	}
	
	@GetMapping("/{id}")
	public String test2WithId(@PathVariable int id) {
		return "success for service 2 with id "+id;
	}

}
