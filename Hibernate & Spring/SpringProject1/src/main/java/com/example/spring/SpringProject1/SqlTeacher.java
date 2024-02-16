package com.example.spring.SpringProject1;

public class SqlTeacher {
	int teacher_id;
	String teacher_Name;
	public SqlTeacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SqlTeacher(int teacher_id, String teacher_Name) {
		super();
		this.teacher_id = teacher_id;
		this.teacher_Name = teacher_Name;
	}
	public int getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}
	public String getTeacher_Name() {
		return teacher_Name;
	}
	public void setTeacher_Name(String teacher_Name) {
		this.teacher_Name = teacher_Name;
	}
	@Override
	public String toString() {
		return "SqlTeacher [teacher_id=" + teacher_id + ", teacher_Name=" + teacher_Name + "]";
	}
	

}
