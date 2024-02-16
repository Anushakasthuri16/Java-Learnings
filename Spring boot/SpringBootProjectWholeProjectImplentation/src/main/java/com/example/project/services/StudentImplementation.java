package com.example.project.services;



import org.springframework.stereotype.Service;

import com.example.project.entity.Student;
import com.example.project.repository.StudentRepo;

@Service
public class StudentImplementation implements StudentService{
	StudentRepo sr;

	public StudentImplementation(StudentRepo sr) {
		super();
		this.sr = sr;
	}

	@Override
	public String createSt(Student st) {
		// TODO Auto-generated method stub
		sr.save(st);
		return "Object is saved";
	}

	@Override
	public Student readStSt(String rollNo) {
		// TODO Auto-generated method stub
		Student st=sr.findById(rollNo).get();
		return st;
	}

	@Override
	public String update(Student st) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteSt(String rollNo) {
		// TODO Auto-generated method stub
		return null;
	}



	
	
}
