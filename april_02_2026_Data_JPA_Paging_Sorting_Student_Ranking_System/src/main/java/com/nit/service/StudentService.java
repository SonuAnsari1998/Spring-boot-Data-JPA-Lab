package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.nit.entity.Student;
import com.nit.repo.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository repository;

	public String saveStudents(Student stu) {
		repository.save(stu);
		return "Student Added Sucessfully";
	}

	public Page<Student> getStudentsByPageAndMultiSort(int page, int size, String direction) {
		Sort sort = direction.equalsIgnoreCase("DESC")
				? Sort.by("marks").descending().and(Sort.by("studentName").ascending())
				: Sort.by("marks").ascending().and(Sort.by("studentName").ascending());

		PageRequest of = PageRequest.of(page, size, sort);
		return repository.findAll(of);

	}
}
