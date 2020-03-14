package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentRepository;
import com.example.demo.model.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student getById(int id) {
		
		return studentRepository.findById(id).get();
	}

	@Override
	public List<Student> getList() {
		
		return studentRepository.findAll();
	}

	@Override
	public Student UpdateStudent() {
		
		return null;
	}

	@Override
	public void deleteStudent(Student student) {
		
		 studentRepository.delete(student);
	}

	@Override
	public Student createStudent(Student student) {
		
		return studentRepository.save(student);
	}

}
