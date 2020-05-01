package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeDao {
	
	public  List<Employee> getEmployee();
	
	public Employee addEmployee(Employee emp);
	
	public void deleteEmployee(Employee emp);
	
	public Employee updateEmployee(Employee emp);
	
	
	

}
