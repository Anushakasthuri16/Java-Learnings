package com.example.Refer;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Personn {
	
	@Id
	int id;
	String name;
	int age;
	@OneToOne
	Bikee b;
	
	
	public Personn() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Personn(int id, String name, int age, Bikee b) {
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


	public Bikee getB() {
		return b;
	}


	public void setB(Bikee b) {
		this.b = b;
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", b=" + b + "]";
	}
	
	
}
	
