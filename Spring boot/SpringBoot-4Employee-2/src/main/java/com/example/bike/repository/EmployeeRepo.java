package com.example.bike.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bike.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, String>{

}
