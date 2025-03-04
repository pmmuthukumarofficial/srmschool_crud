package com.example.srmschool.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.srmschool.model.Student;
import com.example.srmschool.repository.StudentRepoistory;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepoistory studentRepo;

	@Override
	public List<Student> getAllStudents() {
		
		return studentRepo.findAll(); // select * from student
	}

	@Override
	public Optional<Student> getSingleRecord(int rollno) {
		
		return studentRepo.findById(rollno);  // slect * from student where rollno=?
	}

	@Override
	public Student addNewStudent(Student newStudent) {
		// save() add ur data or update ur data
		return studentRepo.save(newStudent); // insert into student values(newStudent.rollno, ...) or update student
	}

	@Override
	public void deleteStudent(int rollno) {
		studentRepo.deleteById(rollno); // delete from student where rollno=?
	}

	@Override
	public List<Student> getStudentsGenderWise(String gender) {
		
		return studentRepo.findByGender(gender);
	}
	
	
}
