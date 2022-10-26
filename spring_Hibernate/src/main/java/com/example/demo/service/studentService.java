package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.student_dto;
import com.example.demo.repository.studentRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class studentService {
	@Autowired
	studentRepo repo;
	
	public  List<student_dto> getAllStudent(){
		return repo.findAll();
	}
	
	
	public  student_dto getSpecificStudent(Integer rollNo){
		return repo.getById(rollNo);
	}
	
	public String saveStudent(student_dto student) {
		try {
			repo.save(student);
			return "Saved successfull !!!!!!";
		}catch (Exception e) {
			return "error in saving ! "+e.toString();
		}	}
	
	public String deleteStudent(Integer rollNo) {
		try { 
			student_dto stu= getSpecificStudent(rollNo);
			System.out.println("student "+stu);
			if(stu==null) throw new Exception("Not found");
			repo.delete(stu);
			return "delete successfull !!!!!!";
		}catch (Exception e) {
			return "error in deletion ! "+e.toString();
		}	
	}
}
