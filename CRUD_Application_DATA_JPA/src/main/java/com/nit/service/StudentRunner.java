package com.nit.service;

import org.hibernate.annotations.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.enties.School;

@Component
public class StudentRunner implements CommandLineRunner {
	@Autowired
	StudentService studentService;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("CRUD Application using Data JPA");
		IO.println("1. Add Student");
		IO.println("2. Update Student");
		IO.println("3. Delete Student");
		IO.println("4. View All Student");
		IO.println("5. Exit.");
		int choice = Integer.parseInt(IO.readln("Enter Your Choice!!!"));
		switch (choice) {
		case 1 -> {
			System.out.println("Add New Student");
			int student_id = Integer.parseInt(IO.readln("Enter Student id"));
			String student_name = IO.readln("Enter Student Name");
			String student_Address = IO.readln("Enter Student Address");
			long student_contact = Long.parseLong(IO.readln("Enter Student contact No."));
			String student_email = IO.readln("Enter Student Email id");
			School student = new School(student_id, student_name, student_Address, student_contact, student_email);
			studentService.addStudent(student);
			IO.println("Student id "+student_id+"Added Sucessfully!!!");
		}
		case 2 -> {
			System.out.println("Update Student Details");
			int student_id = Integer.parseInt(IO.readln("Enter Student id want to update"));
			String student_name = IO.readln("Enter new Student Name");
			String student_Address = IO.readln("Enter new Student Address");
			long student_contact = Long.parseLong(IO.readln("Enter new Student contact No."));
			String student_email = IO.readln("Enter new Student Email id");
			School student = new School(student_id, student_name, student_Address, student_contact, student_email);
			studentService.updateStudentById(student_id, student);
			IO.println("Student id "+student_id+"Updated Sucessfully!!!");

		}
		case 3 -> {
			System.out.println("Delete Student by Student id");

		}
		case 4 -> {
			System.out.println("View Students Details");

		}
		case 5 -> {
			System.out.println("Thank you!!!");
			System.exit(0);

		}
		default -> System.err.println("Invalid choice...");
		}

	}

}
