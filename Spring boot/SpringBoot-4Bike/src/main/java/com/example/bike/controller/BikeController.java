package com.example.bike.controller;


import org.springframework.web.bind.annotation.*;


import com.example.bike.entity.Bike;

@RestController
@RequestMapping("bike")
public class BikeController {
	Bike b;
	@PostMapping
	public String postData(@RequestBody String engNo)
	{
		this.b=b;
		return "Bike data is created";
	}
	
	@GetMapping("{engNO}")
	public Bike GetData(@PathVariable Bike b)
	{
		return b;
	}
	@PutMapping
	public String putData(@RequestBody String engNO)
	{
		this.b=b;
		return "Bike data is updated";
	}
	@DeleteMapping("{engNo}")
	public String deleteData(@PathVariable String engno)
	{
		b=null;
		return "BIke is Deleted";
	}
	
	
	

}
