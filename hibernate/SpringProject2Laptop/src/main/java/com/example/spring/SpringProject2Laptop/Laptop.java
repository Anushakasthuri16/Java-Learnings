package com.example.spring.SpringProject2Laptop;

public class Laptop {
	int sNo;
	String brand;
	float cost;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(int sNo, String brand, float cost) {
		super();
		this.sNo = sNo;
		this.brand = brand;
		this.cost = cost;
	}
	public int getsNo() {
		return sNo;
	}
	public void setsNo(int sNo) {
		this.sNo = sNo;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Laptop [sNo=" + sNo + ", brand=" + brand + ", cost=" + cost + "]";
	}
	

}
