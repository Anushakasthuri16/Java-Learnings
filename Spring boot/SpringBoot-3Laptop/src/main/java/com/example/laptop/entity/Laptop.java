package com.example.laptop.entity;

public class Laptop {
	String srno;
	String brand;
	int cost;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(String srno, String brand, int cost) {
		super();
		this.srno = srno;
		this.brand = brand;
		this.cost = cost;
	}
	public String getSrno() {
		return srno;
	}
	public void setSrno(String srno) {
		this.srno = srno;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Laptop [srno=" + srno + ", brand=" + brand + ", cost=" + cost + "]";
	}
	

}
