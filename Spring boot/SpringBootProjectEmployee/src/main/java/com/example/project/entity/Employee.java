package com.example.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	String empId;
	String name;
	int age;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String empId, String name, int age) {
		super();
		this.empId = empId;
		this.name = name;
		this.age = age;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", age=" + age + "]";
	}
	

}
