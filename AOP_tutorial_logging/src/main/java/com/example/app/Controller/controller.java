package com.example.app.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.Pojo.studentPojo;
import com.example.app.service.studentsService;

@RestController
@RequestMapping("/student")
public class controller {
	
	@Autowired
	studentsService service;
	
	
	
	@GetMapping("/all")
	public ResponseEntity<?> getStudentList(){
		
		return new ResponseEntity<List<studentPojo>>(service.getAllStudent(),HttpStatus.OK);		
	}

}
