package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.StudentEntity;

@RestController
@RequestMapping("student")
public class StudentController {
	@GetMapping("{kodId}")
	public StudentEntity getStudentInfo(@PathVariable String kodId)
	{
		StudentEntity se=new StudentEntity(kodId,"Amit",23);
		return se;
		
	}

}
