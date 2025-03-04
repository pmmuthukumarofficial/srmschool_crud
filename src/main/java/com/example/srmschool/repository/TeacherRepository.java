package com.example.srmschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.srmschool.model.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

}
