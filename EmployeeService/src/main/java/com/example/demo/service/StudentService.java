package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentService {
	
	
	public Student getById(int id);
	
	public Student createStudent(Student student);

	public List<Student> getList();
	
	public Student UpdateStudent();
	
	public void deleteStudent(Student student);
}
