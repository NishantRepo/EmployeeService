package com.example.demo.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeRepository;
import com.example.demo.model.Employee;

@Service
@Transactional
public class EmployeeServiceImpl  {
	
	private final EmployeeRepository empRepo;
	
	public EmployeeServiceImpl(EmployeeRepository empRepo) {
		this.empRepo=empRepo;
	
		}
	
	public Employee SaveEmployee(Employee emp) {
		return empRepo.save(emp);
		
		
	}
	
	
	}