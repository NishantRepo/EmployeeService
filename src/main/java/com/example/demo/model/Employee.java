package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table
public class Employee {
	
	@Id
	//@GeneratedValue
	private int id;
	private String firstname;
	private String lastName;
	private float salary;
	private String emailId;
	public Employee(int id, String firstname, String lastName, float salary, String emailId) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastName = lastName;
		this.salary = salary;
		this.emailId = emailId;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	

}
