package com.muneendra.student.service;

import java.util.List;

import com.muneendra.student.entity.Student;

public interface StudentService {
	public List<Student> findAll();

	public Student findById(int theId);

	public void save(Student theStudent);

	public void deleteById(int theId);

	

}
