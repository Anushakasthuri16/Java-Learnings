package com.example.Refer;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bikee {
	@Id
	int EngNo;
	String Name;
	int cost;
	public Bikee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bikee(int engNo, String name, int cost) {
		super();
		EngNo = engNo;
		Name = name;
		this.cost = cost;
	}
	public int getEngNo() {
		return EngNo;
	}
	public void setEngNo(int engNo) {
		EngNo = engNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Bike [EngNo=" + EngNo + ", Name=" + Name + ", cost=" + cost + "]";
	}
	
	
	
	
	

}
