package com.example.laptop.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

import com.example.laptop.entity.Laptop;

@RestController
@RequestMapping("laptop")
public class LaptopController {
	@GetMapping("{srno}")
	public Laptop create(@PathVariable String srno)
	
	{
		Laptop lp=new Laptop(srno,"hp",60000);
		return lp;
	}
/*	@PutExchange()
	public String update()
	{
		return "Laptop Object is updated";
	}
	@DeleteMapping()
	public String delete()
	{
		return "Laptop Object is deleted";
	}
	*/


}
