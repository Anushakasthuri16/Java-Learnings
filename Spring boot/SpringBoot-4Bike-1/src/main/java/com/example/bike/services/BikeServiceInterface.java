package com.example.bike.services;

import java.util.List;

import com.example.bike.entity.Bike;

public interface BikeServiceInterface {
	
	public String createBike(Bike b);
	public List<Bike> fetchAllData();
	public String updateBike(Bike b);
	public String deleteBike(String engNo);
	
	
	
	

}
