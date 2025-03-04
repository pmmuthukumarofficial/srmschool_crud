package com.example.srmschool.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.srmschool.model.Student;

public interface StudentRepoistory extends JpaRepository<Student, Integer> {

	List<Student> findByGender(String gender);  // findBy  or  getBy    select * from student where gender=?
	
	
//	List<Student> findByStdAndSection(int std, String section); // selct * from student where std=? and section=?
	
	
}
