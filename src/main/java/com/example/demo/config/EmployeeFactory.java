package com.example.demo.config;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Employee;

public class EmployeeFactory {
	
	List<Employee> create() {
		Employee e = new Employee(1, "first name", "lastName", 200000, "first@gmail.com");
		Employee e1 = new Employee(2, "first name", "lastName", 200000, "second@gmail.com");
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e);
		return list;
	}

}
