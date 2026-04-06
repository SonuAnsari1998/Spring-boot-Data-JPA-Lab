package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Student;
import com.nit.repository.StudentRepository;


@Service
public class StudentService implements IStudentService {
	@Autowired
	StudentRepository repository;

	@Override
	public List<Student> findByCourse(String course) {
		List<Student> byCourse = repository.findByCourse(course);
		return byCourse;
	}

	@Override
	public List<Student> findByMarksGreaterThan(Double marks) {
		List<Student> byMarksGreaterThan = repository.findByMarksGreaterThan(marks);
		return byMarksGreaterThan;
	}

	@Override
	public List<Student> findByMarksBetween(Double min, Double max) {
		List<Student> byMarksBetween = repository.findByMarksBetween(min, max);
		return byMarksBetween;
	}

	@Override
	public List<Student> findByGrade(String grade) {
		return repository.findByGrade(grade);
	}

	@Override
	public List<Student> findByCity(String city) {
		return repository.findByCity(city);
	}

	@Override
	public List<Student> findByPassedTrue() {
		return repository.findByPassedTrue();
	}

	@Override
	public List<Student> findByNameStartingWith(String prefix) {
		return repository.findByNameStartingWith(prefix);
	}

	@Override
	public List<Student> findByCourseAndPassed(String course, Boolean status) {
		return repository.findByCourseAndPassed(course, status);
	}

	@Override
	public List<Student> findTop3ByOrderByMarksDesc() {
		return repository.findTop3ByOrderByMarksDesc();
	}

}
