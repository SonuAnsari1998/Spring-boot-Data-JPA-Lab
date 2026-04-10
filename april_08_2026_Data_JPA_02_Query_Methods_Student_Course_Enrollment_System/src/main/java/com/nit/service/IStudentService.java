package com.nit.service;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.nit.entity.Student;

public interface IStudentService {
	String  addStudent(Student student);
	
	List<Student> viewStudent();
	
	
	List<Student> findbyCourse(String course);

	List<Student> findbyFeeLessThan(double amount);

	List<Student> findbyGrade(String grade);

	List<Student> findbyStudentKeyword(String keyword);

	long countCourseStudent(String course);
	
	List<Student> serchStudentByName(String name);

	String updateStudentById(String grade, Long id);

	String deleteStudentByCourse(String course);
}
