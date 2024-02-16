package com.example.Bi.OneToMany;



import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class softwareEng {
	@Id
	int id;
	String name;
	int Age;
	@OneToMany
	List <Technology> a;
	
	
	public softwareEng() {
		super();
		// TODO Auto-generated constructor stub
	}


	public softwareEng(int id, String name, int age, List a) {
		super();
		this.id = id;
		this.name = name;
		Age = age;
		this.a = a;
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
		return Age;
	}


	public void setAge(int age) {
		Age = age;
	}


	public List getT() {
		return a;
	}


	public void setT(List a) {
		this.a = a;
	}


	@Override
	public String toString() {
		return "softwareEng [id=" + id + ", name=" + name + ", Age=" + Age + ", a=" + a + "]";
	}
}
