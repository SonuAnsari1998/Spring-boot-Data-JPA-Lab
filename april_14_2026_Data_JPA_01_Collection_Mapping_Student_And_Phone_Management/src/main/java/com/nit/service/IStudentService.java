package com.nit.service;

import java.util.Optional;

import com.nit.entity.Student;

public interface IStudentService {
	//Save student with phone numbers
	String saveStudent(Student student);
	
	
	//Fetch student details
	Optional<Student> getStudentDetails(Long id);
	
	
	
}
