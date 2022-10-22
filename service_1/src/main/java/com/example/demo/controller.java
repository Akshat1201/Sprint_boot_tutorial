package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller1")
public class controller {
	
	@GetMapping
	public String test1() {
		return "service 1 success call";
	}
	
	@GetMapping("/{id}")
	public String testWithId(@PathVariable int id) {
		return "service 1 success call with id "+id;
	}
}
