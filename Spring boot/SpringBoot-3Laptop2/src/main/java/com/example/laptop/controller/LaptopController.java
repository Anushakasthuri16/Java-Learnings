package com.example.laptop.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.laptop.entity.Laptop;

@RestController
@RequestMapping("laptop")
public class LaptopController {
	Laptop lap;
	@PostMapping
	public String postData(@RequestBody Laptop lap)
	{
		this.lap=lap;
		return "Laptop is created";
	}
	@GetMapping("{srNo}")
	public Laptop GetData(@PathVariable String srNo )
	{
		return lap;
	}
	
	@PutMapping
	public String updateData(@RequestBody Laptop lap)
	{
		this.lap=lap;
		return "Laptop is Updated ";
	}
	@DeleteMapping("{srNo}")
	public String deletedata(@PathVariable String srNo)
	{
		lap=null;
		return "Laptop is deleted";
		
	}
}
