package com.example.bike.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bike.entity.Bike;
import com.example.bike.services.BikeServiceClass;

@RestController
@RequestMapping("bike1")
public class BikeController {
	BikeServiceClass brCls;
	
	public BikeController(BikeServiceClass brCls) {
		super();
		this.brCls = brCls;
	}
	@PostMapping
	public String createBike(Bike b)
	{
		String msg=brCls.createBike(b);
		return msg;
	}
	

}
