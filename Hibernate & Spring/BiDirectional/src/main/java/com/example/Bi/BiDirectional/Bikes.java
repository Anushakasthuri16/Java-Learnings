package com.example.Bi.BiDirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Bikes {
	@Id
	int EngNo;
	String Name;
	int cost;
	@OneToOne
	Persons p;
	public Bikes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bikes(int engNo, String name, int cost, Persons p) {
		super();
		EngNo = engNo;
		Name = name;
		this.cost = cost;
		this.p = p;
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
	public Persons getP() {
		return p;
	}
	public void setP(Persons p) {
		this.p = p;
	}
	@Override
	public String toString() {
		return "Bikes [EngNo=" + EngNo + ", Name=" + Name + ", cost=" + cost + ", p=" + p + "]";
	}
	
	
}
