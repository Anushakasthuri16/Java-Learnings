package com.example.laptop.entity;

public class Laptop {
	String srNo;
	String name;
	int age;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(String srNo, String name, int age) {
		super();
		this.srNo = srNo;
		this.name = name;
		this.age = age;
	}
	public String getSrNo() {
		return srNo;
	}
	public void setSrNo(String srNo) {
		this.srNo = srNo;
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
		return "Laptop [srNo=" + srNo + ", name=" + name + ", age=" + age + "]";
	}
	
	

}
