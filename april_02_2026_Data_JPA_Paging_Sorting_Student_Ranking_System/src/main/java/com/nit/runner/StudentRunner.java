package com.nit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.nit.entity.Student;
import com.nit.service.StudentService;

@Component
public class StudentRunner implements CommandLineRunner {
	@Autowired
	StudentService service;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Student Ranking System");
		IO.println("1. Add Student");
		IO.println("2. View Student Details");
		IO.println("3. Exit");
		int ch = Integer.parseInt(IO.readln("Enter your choice..."));
		switch (ch) {
		case 1 -> {
			int studentId =Integer.parseInt(IO.readln("Enter Sudent id"));
			String studentName =IO.readln("Enter Student Name");
			String course = IO.readln("Enter Course");
			double marks = Double.parseDouble(IO.readln("Enter marks"));
			Student student = new Student(studentId,studentName,course,marks);
			String status = service.saveStudents(student);
			System.out.println(status);
		}
		case 2 -> {
			int page =Integer.parseInt(IO.readln("Enter Page"));
			int size =Integer.parseInt(IO.readln("Enter Size"));
			String direction =IO.readln("Enter Direction");
			Page<Student> studentsByPageAndMultiSort = service.getStudentsByPageAndMultiSort(page, size, direction);
			studentsByPageAndMultiSort.forEach(IO::println);
		}
		case 3 -> {
			System.out.println("Thank you!!!");
			System.exit(0);
		}
		default -> System.err.println("Invalid choice");
		}
	}

}
