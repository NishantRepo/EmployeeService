package com.example.demo.controller;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping(path = "/student", produces = MediaType.APPLICATION_JSON_VALUE)
public class StudentConroller {

	@Autowired
	private StudentService studentService;

	@GetMapping("/getAll")
	public List<Student> createStudent() {
		return studentService.getList();
	}

	@PostMapping("/get")
	public Student getStudent(@RequestParam @NotNull int id) {
		return studentService.getById(id);
	}

	@PostMapping("/create")
	public Student createStudent(@RequestBody Student student) {
		return studentService.createStudent(student) ;
	}

	@PostMapping("/delete")
	public void delete(@RequestBody Student student) {
		studentService.deleteStudent(student);
	}

	@PostMapping("/update")
	public Student updateStudent(@RequestBody Student student) {
		return studentService.updateStudent(student);
	}
}
