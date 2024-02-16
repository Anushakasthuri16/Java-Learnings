package com.example.bike.services;

import java.util.List;

import com.example.bike.entity.Employee;

public interface EmployeeService {
	
	String addEmployee(Employee e);
	Employee getEmployeeInfo(String empId);
	List<Employee> getAllEmployeeInfo();
	String updateEmployee(Employee e);
	String deleteEmployee(String empId);

}
