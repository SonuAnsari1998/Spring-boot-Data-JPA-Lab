package com.nit.service;

import java.util.List;

import com.nit.entity.Student;

public interface IStudentService {
	
	public List<Student> findByCourse(String course);

	public List<Student> findByMarksGreaterThan(Double marks);

	public List<Student> findByMarksBetween(Double min, Double max);

	public List<Student> findByGrade(String grade);

	public List<Student> findByCity(String city);

	public List<Student> findByPassedTrue();

	public List<Student> findByNameStartingWith(String prefix);
	
	public List<Student> findByCourseAndPassed(String course, Boolean status);

	public List<Student> findTop3ByOrderByMarksDesc();
}
