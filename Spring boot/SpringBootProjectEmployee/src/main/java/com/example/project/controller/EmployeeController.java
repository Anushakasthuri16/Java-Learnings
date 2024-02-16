package com.example.project.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.entity.Employee;
import com.example.project.service.EmployeeServiceClass;
@RestController
@RequestMapping("emp")
public class EmployeeController {
	EmployeeServiceClass esc;

	public EmployeeController(EmployeeServiceClass esc) {
		super();
		this.esc = esc;
	}
	@PostMapping
	public String add(@RequestBody Employee e) {
		// TODO Auto-generated method stub
		String msg=esc.add(e);
		return msg;
	}
	@GetMapping(value="{empId}")
	public Employee fetch(@PathVariable String empId) {
		Employee emp=esc.fetch(empId);
		return emp;
	}

	@GetMapping
	public List<Employee> fetchAll() {
		// TODO Auto-generated method stub
		List el=esc.fetchAll();
		return el;
	}
	@PutMapping
	public String update(@RequestBody Employee e) {
		String ms=esc.update(e);
		return ms;

	}

	@DeleteMapping(value="{empId}")
	public String delete(@PathVariable String empId) {
		// TODO Auto-generated method stub
		esc.delete(empId);
		return "Employee Object is deleted";
	}

}
