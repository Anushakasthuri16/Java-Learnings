package com.example.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DataController {
	@GetMapping("/display")
	public String display()
	{
		return "response";
	}

}
