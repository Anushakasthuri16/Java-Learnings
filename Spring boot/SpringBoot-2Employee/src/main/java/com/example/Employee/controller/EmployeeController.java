package com.example.Employee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Employee.entity.Employee;

@RestController
@RequestMapping("employee")
public class EmployeeController {
	@GetMapping("{id}")
	public Employee empInfo(@PathVariable String id)
	{
		Employee e=new Employee(id,"Anu", 30000);
		return e;
	}

}
