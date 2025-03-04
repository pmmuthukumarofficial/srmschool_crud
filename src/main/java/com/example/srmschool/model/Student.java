package com.example.srmschool.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {   // POJO class (Plain Old Java Object)

	@Id
	private Integer rollno;   // findById()
	private String name;
	private String gender;  
	private Integer std;
	private String section;
	
	public Integer getRollno() {
		return rollno;
	}
	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getStd() {
		return std;
	}
	public void setStd(Integer std) {
		this.std = std;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	
	
}
