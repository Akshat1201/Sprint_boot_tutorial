package com.example.demo.controller;

import java.util.List;

import com.example.demo.entity.student_dto;
import com.example.demo.service.studentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class Controller {
	
	@Autowired
	studentService  service;
	
	@GetMapping
	public List<student_dto> getAllStudent() {
		return service.getAllStudent();
	}
	
	@GetMapping
	@RequestMapping("/roll_no/{id}")
	public student_dto getSpecificStudent(@PathVariable("id") Integer rollNo) {
		return service.getSpecificStudent(rollNo);
	}
	
	@PostMapping
	@RequestMapping("/save")
	public String saveStudent(@RequestBody student_dto student) {
		return service.saveStudent(student);
	}
	
	@DeleteMapping
	@RequestMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable("id") Integer rollno) {
		return service.deleteStudent(rollno);
	}

}
