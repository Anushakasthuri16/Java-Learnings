package com.example.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.project.entity.Student;
import com.example.project.services.StudentImplementation;
@Controller

public class DataController {
	
	StudentImplementation si;
	
	public DataController(StudentImplementation si) {
		super();
		this.si = si;
	}

	@PostMapping("/addStudent")
	public String createSt(Student st) {
		// TODO Auto-generated method stub
		String s=si.createSt(st);
		return "sucess";
	}

	/* @GetMapping
	public Student readStSt(String rollNo) {
		// TODO Auto-generated method stub
		Student s=si.readStSt(rollNo);
		return s;
	}
*/
}
