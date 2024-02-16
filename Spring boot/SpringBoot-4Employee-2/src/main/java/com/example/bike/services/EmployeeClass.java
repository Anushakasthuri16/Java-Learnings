package com.example.bike.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bike.entity.Employee;
import com.example.bike.repository.EmployeeRepo;
@Service
public class EmployeeClass implements EmployeeService{
	EmployeeRepo emRepo;
	

	

	public EmployeeClass(EmployeeRepo emRepo) {
		super();
		this.emRepo = emRepo;
	}

	@Override
	public String addEmployee(Employee e) {
		// TODO Auto-generated method stub
		emRepo.save(e);
		return "Employee Object is Created";
	}

	@Override
	public Employee getEmployeeInfo(String empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployeeInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteEmployee(String empId) {
		// TODO Auto-generated method stub
		return null;
	}

}
