package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.entity.Student;

public interface StudentRepo extends JpaRepository<Student, String>{

}
