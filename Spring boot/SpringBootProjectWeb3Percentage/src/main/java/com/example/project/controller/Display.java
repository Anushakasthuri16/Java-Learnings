package com.example.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/control")
public class Display {
	@GetMapping
	public String data(@RequestParam String name,int t,int h,int e,int m, int s)
	{
		double total=((t+h+e+m+s)/500.0)*100.0;
		return "Total Percentage of "+name+" is: "+total;
	}

}
