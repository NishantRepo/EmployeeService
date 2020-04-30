package com.example.demo.service;

import java.util.List;
import java.util.Optional;

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
		Optional<Student> stud = studentRepository.findById(student.getId());
		if (!stud.isPresent()) {
			throw new StudentNotFoundException("Invalid Student ID");
		} else {
			Student s = stud.get();
			s.setName(student.getName() == null ? s.getName() : student.getName());
			s.setAddress(student.getAddress() == null ? s.getAddress() : student.getAddress());
			return studentRepository.save(s);
		}
	}

	@Override
	public Student update(Student student) {
		return studentRepository.findById(student.getId()).map(stud -> {
			stud.setAddress(student.getAddress());
			stud.setName(student.getName());
			return studentRepository.save(stud);
		}).get();
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
