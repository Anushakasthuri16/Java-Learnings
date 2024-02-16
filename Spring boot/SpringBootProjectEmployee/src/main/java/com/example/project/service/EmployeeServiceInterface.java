package com.example.project.service;

import java.util.List;

import com.example.project.entity.Employee;

public interface EmployeeServiceInterface {
	String add(Employee e);
	Employee fetch(String empId);
	List<Employee> fetchAll();
	String update(Employee e);
	String delete(String empId);
	
	

}
