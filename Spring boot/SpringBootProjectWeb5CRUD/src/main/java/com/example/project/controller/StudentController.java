package com.example.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class StudentController {
	@GetMapping("/create")
	public String createStudent()
	{
		return "CreateStudent";
	}
	@GetMapping("/read")
	public String readStudent()
	{
		return "ReadStudent";
	}
	@GetMapping("/update")
	public String updateStudent()
	{
		return "UpdateStudent";
	}
	@GetMapping("/delete")
	public String deleteStudent()
	{
		return "DeleteStudent";
	}

}
