package com.example.demo.service;

import java.util.List;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentRepository;
import com.example.demo.exception.StudentNotFoundException;
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
	public Student updateStudent(Student student) {
		Student stud = studentRepository.findById(student.getId()).get();
		if(stud == null) {
			throw new StudentNotFoundException("Invalid Student ID") ;
		} else {
		stud.setName(student.getName() == null ? stud.getName() : student.getName());
		stud.setAddress(student.getAddress() == null ? stud.getAddress() : stud.getAddress());
		return studentRepository.save(stud);
		}
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
