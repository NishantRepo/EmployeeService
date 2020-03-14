package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeServiceImpl;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeServiceImpl employeeService;

	
	
	@RequestMapping("/")
	public String welcome(ModelMap map) {
		return "employee";
		
	}
	
	@PostMapping("/login")
	public String welcome(ModelMap map, @RequestParam int id, @RequestParam String firstname, 
			@RequestParam String lastname, @RequestParam String emailId, 
			@RequestParam float salary) {
		
		Employee emp=new Employee(id,firstname,lastname,salary,emailId);
		Employee employee = employeeService.SaveEmployee(emp);
		return employee != null ? "success" : "employee";
		
	}
	
	@GetMapping("/add")
	public String saveEmployee(@RequestParam int id, @RequestParam String firstname, 
			@RequestParam String lastname, @RequestParam String emailId, 
			@RequestParam float salary)	{
		
		Employee emp=new Employee(id,firstname,lastname,salary,emailId);
		
		employeeService.SaveEmployee(emp);
		
		return "Employee save";
		
	}
	
}