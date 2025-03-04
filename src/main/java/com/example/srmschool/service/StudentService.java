package com.example.srmschool.service;

import java.util.List;
import java.util.Optional;

import com.example.srmschool.model.Student;

public interface StudentService {
	
	List<Student> getAllStudents();
	
	Optional<Student> getSingleRecord(int rollno); // isEmpty() and isPresent()

	Student addNewStudent(Student newStudent);
	
	void deleteStudent(int rollno);
	
	List<Student> getStudentsGenderWise(String gender);

}
