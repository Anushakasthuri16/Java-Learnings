package com.example.bike.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bike.entity.Employee;
import com.example.bike.services.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	EmployeeService empSer;

		
	public EmployeeController(EmployeeService empSer) {
		super();
		this.empSer = empSer;
	}


	@PostMapping
	public String addEmployee(@RequestBody Employee e)
	{
		String msg=empSer.addEmployee(e);
		return msg;
	}

}
