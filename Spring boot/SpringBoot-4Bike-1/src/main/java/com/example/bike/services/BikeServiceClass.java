package com.example.bike.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bike.entity.Bike;
import com.example.bike.repositories.BikeRepositories;
@Service
public class BikeServiceClass implements BikeServiceInterface{
	BikeRepositories bkRepo;

	public BikeServiceClass(BikeRepositories bkRepo) {
		super();
		this.bkRepo = bkRepo;
	}

	@Override
	public String createBike(Bike b) {
		// TODO Auto-generated method stub
		bkRepo.save(b);
		return "Bike object is Created";
	}

	@Override
	public List<Bike> fetchAllData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateBike(Bike b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteBike(String engNo) {
		// TODO Auto-generated method stub
		return null;
	}   
	
	

}
