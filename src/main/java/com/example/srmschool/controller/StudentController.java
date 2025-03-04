package com.example.srmschool.controller;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.srmschool.model.Student;
import com.example.srmschool.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studService;
	
	@GetMapping("/api/students")
	public List<Student> getAllRecords()
	{
		return studService.getAllStudents();
	}
	
	@GetMapping("/api/students/{id}")   // num=
	public Optional<Student> apiForSingleRecord(@PathVariable("id") int rollno)
	{
		return studService.getSingleRecord(rollno);
	}
	
	@PostMapping("/api/student")
	public Student apiForAddData(@RequestBody Student newData)
	{
		Optional<Student> opt=studService.getSingleRecord(newData.getRollno());
		
		if(opt.isEmpty()) {
			return studService.addNewStudent(newData);
		}			
		else
			return new Student();
	}
	
	@PutMapping("/api/student")
	public Student apiForUpdateRecord(@RequestBody Student updateData)
	{
		Optional<Student> opt=studService.getSingleRecord(updateData.getRollno());
		
		if(opt.isPresent())		
			return studService.addNewStudent(updateData);
		else
			return new Student();			
	}
	
	@DeleteMapping("/api/students/{id}")
	public Optional<Student> apiForDeleteRecord(@PathVariable("id") int rollno)
	{
		Optional<Student> opt=studService.getSingleRecord(rollno);// get data from db
		
		if(opt.isPresent())
		{
			studService.deleteStudent(rollno); //
			return opt;
		}
		else
			return opt;
	}
	
	@GetMapping("/api/students/search/{gend}")
	public List<Student> apiForGetStudentGenderWise(@PathVariable("gend") String gender)
	{
		return studService.getStudentsGenderWise(gender);
	}

}
