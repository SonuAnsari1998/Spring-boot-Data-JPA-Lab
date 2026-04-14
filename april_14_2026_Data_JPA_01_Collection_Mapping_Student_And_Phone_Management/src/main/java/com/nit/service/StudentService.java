package com.nit.service;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Student;
import com.nit.repo.StudentRepo;

import jakarta.transaction.Transactional;

@Service
public class StudentService implements IStudentService {
	@Autowired
	StudentRepo repository;
	
	@Override
	public String saveStudent(Student student) {
		 Long id = repository.save(student).getId();
		 return "Student Added Sucessfully with id: "+id;
	}

    @Transactional
	public Optional<Student> getStudentDetails(Long id) {
		Optional<Student> byId = repository.findById(id);
		  System.out.println(byId.get().getPhoneNumbers());  
	        		 return byId;
	}

}
