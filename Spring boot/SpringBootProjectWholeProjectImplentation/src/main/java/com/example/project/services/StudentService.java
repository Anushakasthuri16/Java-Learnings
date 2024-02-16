package com.example.project.services;

import java.util.List;

import com.example.project.entity.Student;

public interface StudentService {
	public String createSt(Student st);
	public Student readStSt(String rollNo);
	public String update(Student st);
	public String deleteSt(String rollNo);
	
	
	

}
