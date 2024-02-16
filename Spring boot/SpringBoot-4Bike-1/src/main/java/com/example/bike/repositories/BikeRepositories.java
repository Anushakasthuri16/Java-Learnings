package com.example.bike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bike.entity.Bike;

public interface BikeRepositories extends JpaRepository<Bike, String>{

}
