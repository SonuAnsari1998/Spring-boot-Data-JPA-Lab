package com.nit.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.controller.StudentRepo;
import com.nit.enties.School;

@Service
public class StudentService {
	@Autowired
	StudentRepo studentRepo;

	public void addStudent(School sc) {
		studentRepo.save(sc);
	}

	public void updateStudentById(int id, School student) {
		Optional<School> byId = studentRepo.findById(id);
		if (byId.isPresent()) {
			School school = byId.get();
			school.setStudent_name(student.getStudent_name());
			school.setStudent_Address(student.getStudent_Address());
			school.setStudent_contact(school.getStudent_contact());
			school.setStudent_email(student.getStudent_email());
			studentRepo.save(school);
		} else {
			System.err.println(id + "Not found...");
		}
	}

}
