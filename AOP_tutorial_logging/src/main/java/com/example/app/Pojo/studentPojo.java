package com.example.app.Pojo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class studentPojo implements Serializable {
	
	private static final long serialversionUID =1L;
	
	@Id
	@Column(name="ROLLNO")
	private Integer rollNo;

	@Column(name="NAME")
	private String name;

	@Column(name="CLASS")
	private String studentClass;

	@Column(name="MARKS")
	private Integer marks;

	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	public studentPojo(Integer rollNo, String name, String studentClass, Integer marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.studentClass = studentClass;
		this.marks = marks;
	}

	public studentPojo() {
		super();
	}

	@Override
	public String toString() {
		return "student_dto [rollNo=" + rollNo + ", name=" + name + ", studentClass=" + studentClass + ", marks="
				+ marks + "]";
	}
	

}
