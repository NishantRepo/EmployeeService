package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentConroller {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/getAll")
	public List<Student> createStudent() {
		
		return studentService.getList();
	}
	
	@PostMapping("/getStudent")
	public Student getStudent(@RequestParam int id) {
		return studentService.getById(id);
	}
	
	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student student) {
		return studentService.createStudent(student) ;
	}
}
