package com.nit.runner;

import java.util.List;

import org.hibernate.annotations.NaturalId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Student;
import com.nit.service.StudentService;
/*Get top scorers
Filter students who passed
Search students by name
Get students from specific cities*/

@Component
public class StudentRunner implements CommandLineRunner {
	@Autowired
	StudentService service;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("1. Find by Course\r\n" + "2. Marks Greater Than\r\n" + "3. Marks Between\r\n"
				+ "4. Find by Grade\r\n" + "5. Find by City\r\n" + "6. Find Passed Students\r\n"
				+ "7. Name Starts With\r\n" + "8. Course and Passed\r\n" + "9. Top 3 by Marks");

		int choice = Integer.parseInt(IO.readln("Enter Your Choice"));
		switch (choice) {
		case 1 -> {
			String course = IO.readln("Enter Course ");
			List<Student> byCourse = service.findByCourse(course);
			byCourse.forEach(IO::println);
		}
		case 2 -> {
			double marks = Double.parseDouble(IO.readln("Enter marks"));
			List<Student> byMarksGreaterThan = service.findByMarksGreaterThan(marks);
			byMarksGreaterThan.forEach(IO::println);
		}
		case 3 -> {
			double min = Double.parseDouble(IO.readln("Enter Minimum marks"));
			double max = Double.parseDouble(IO.readln("Enter Maximum marks"));
			List<Student> byMarksBetween = service.findByMarksBetween(min, max);
			byMarksBetween.forEach(IO::println);
		}
		case 4 -> {
			String grade = IO.readln("Enter Grade ");
			List<Student> byGrade = service.findByGrade(grade);
			byGrade.forEach(IO::println);
		}
		case 5 -> {
			String city = IO.readln("Enter city ");
			List<Student> byCity = service.findByCity(city);
			byCity.forEach(IO::println);
		}
		case 6 -> {
			List<Student> byPassedTrue = service.findByPassedTrue();
			byPassedTrue.forEach(IO::println);
		}
		case 7 -> {
			String prefix = IO.readln("Enter Prefix");
			List<Student> byNameStartingWith = service.findByNameStartingWith(prefix);
			byNameStartingWith.forEach(IO::println);

		}
		case 8 -> {
			String course = IO.readln("Enter Course");
			boolean status = Boolean.parseBoolean(IO.readln("Enter status (true/false)"));
			List<Student> byCourseAndPassed = service.findByCourseAndPassed(course, status);
			byCourseAndPassed.forEach(IO::println);
		}
		case 9 -> {
			List<Student> top3ByOrderByMarksDesc = service.findTop3ByOrderByMarksDesc();
			top3ByOrderByMarksDesc.forEach(IO::println);
		}
		case 10 -> {
			System.exit(0);
			System.out.println("Thank you!!!");
		}

		default -> System.err.println("Invalid choice");
		}
	}

}
