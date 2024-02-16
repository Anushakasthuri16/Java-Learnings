package com.example.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.project.entity.Employee;
import com.example.project.repository.EmployeeRepository;
@Service
public class EmployeeServiceClass implements EmployeeServiceInterface{
	EmployeeRepository emRep;

	

	public EmployeeServiceClass(EmployeeRepository emRep) {
		super();
		this.emRep = emRep;
	}

	@Override
	public String add(Employee e) {
		// TODO Auto-generated method stub
		emRep.save(e);
		return "Employee Object is Created";
	}

	@Override
	public Employee fetch(String empId) {
		Employee emp=emRep.findById(empId).get();
		return emp;
	}

	@Override
	public List<Employee> fetchAll() {
		// TODO Auto-generated method stub
		List empList=emRep.findAll();
		return empList;
	}

	@Override
	public String update(Employee e) {
		emRep.save(e);
		return "Employee Object is Updated";

	}

	@Override
	public String delete(String empId) {
		// TODO Auto-generated method stub
		emRep.deleteById(empId);
		return "Employee Object is deleted";
	}
	

}
