package com.example.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.Pojo.studentPojo;
import com.example.app.repository.studentRepo;
import com.example.app.service.studentsService;

@Service
public class serviceImpl implements studentsService{
	
	@Autowired
	studentRepo repository;

	@Override
	public List<studentPojo> getAllStudent() {
		return (List<studentPojo>) repository.findAll();
	}

}
