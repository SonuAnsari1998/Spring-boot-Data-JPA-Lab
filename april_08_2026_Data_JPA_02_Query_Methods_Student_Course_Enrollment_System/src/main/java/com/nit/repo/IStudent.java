package com.nit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.nit.entity.Student;

public interface IStudent extends JpaRepository<Student, Long> {

	// Find students by course
	@Query("from Student where course= :course")
	List<Student> findbyCourse(String course);

	// Find students with fee less than a given amount
	@Query("from Student where fee <= :amount")
	List<Student> findbyFeeLessThan(double amount);

	// Find students by grade
	@Query("from Student where grade = :grade")
	List<Student> findbyGrade(String grade);

	// Search students by name keyword
	@Query("from Student s where lower(s.name) like lower(concat('%', :keyword, '%'))")
	List<Student> findbyStudentKeyword(String keyword);

	// Count students in a course
	@Query("select count(s.course) from Student s where course = :course")
	long countCourseStudent(String course);

	// Update student grade by id (@Modifying)
	@Modifying
	@Query("Update Student s set s.grade= :grade where s.id= :id")
	String updateStudentById(String grade, Long id);
	
	
	@Query("from Student where name = :name")
	List<Student> findByName(String name);

	// Delete students by course (@Modifying)
	@Modifying
	@Query("delete from Student s where s.course= :course")
	String deleteStudentByCourse(String course);
}
