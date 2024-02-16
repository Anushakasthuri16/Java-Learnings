package com.example.Bi.BiDirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Persons {
	@Id
	int id;
	String name;
	int age;
	@OneToOne
	Bikes b;
	
	
	public Persons() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Persons(int id, String name, int age, Bikes b) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.b = b;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public Bikes getB() {
		return b;
	}


	public void setB(Bikes b) {
		this.b = b;
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", b=" + b + "]";
	}
	
	
}


