package com.example.srmschool.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import com.example.srmschool.model.Teacher;

public class TeacherController {
	
	// here basic CRUD api are there
	
	@GetMapping("/api/students/gender")
	public List<Teacher> sampleApi()
	{
		return null;
	}

}
