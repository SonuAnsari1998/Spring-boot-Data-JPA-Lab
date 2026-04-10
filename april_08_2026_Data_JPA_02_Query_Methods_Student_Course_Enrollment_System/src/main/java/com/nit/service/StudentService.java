package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nit.entity.Student;
import com.nit.repo.IStudent;

@Component
public class StudentService implements IStudentService {
	
	@Autowired
	IStudent iStudent;
	
	@Override
	public List<Student> viewStudent(){
		return iStudent.findAll();
	}

	@Override
	public String addStudent(Student student) {
		iStudent.save(student);
		return "Student Added Sucessfully!!!";
	}
	@Override
	public List<Student> findbyCourse(String course) {
		return iStudent.findbyCourse(course);
	}

	@Override
	public List<Student> findbyFeeLessThan(double amount) {
		return iStudent.findbyFeeLessThan(amount);
	}

	@Override
	public List<Student> findbyGrade(String grade) {
		return iStudent.findbyGrade(grade);
	}

	@Override
	public List<Student> findbyStudentKeyword(String keyword) {
		return iStudent.findbyStudentKeyword(keyword);
	}
	
	
	@Override
	public List<Student> serchStudentByName(String name) {
		return iStudent.findByName(name);
	}
	
	
	
	

	@Override
	public long countCourseStudent(String course) {
		long countCourseStudent = iStudent.countCourseStudent(course);
		return countCourseStudent;
	}

	@Override
	public String updateStudentById(String grade, Long id) {
		iStudent.updateStudentById(grade, id);
		return "Id: " + id + " Updated Sucessfully";
	}

	@Override
	public String deleteStudentByCourse(String course) {
		iStudent.deleteStudentByCourse(course);
		return "Course: " + course + " Deleted Sucessfully";
	}

	


}
