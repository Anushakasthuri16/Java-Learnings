package com.example.Bi.OneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Technology {
	@Id
	int id;
	String Name;

	public Technology() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Technology(int id, String name) {
		super();
		this.id = id;
		Name = name;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	@Override
	public String toString() {
		return "Technology [id=" + id + ", Name=" + Name + "]";
	}
	
	

}
