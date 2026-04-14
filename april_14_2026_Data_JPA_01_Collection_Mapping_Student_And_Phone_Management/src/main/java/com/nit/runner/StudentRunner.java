package com.nit.runner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Student;
import com.nit.service.StudentService;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.JoinColumn;

@Component
public class StudentRunner implements CommandLineRunner {
	@Autowired
	StudentService service;

	@Override
	public void run(String... args) throws Exception {
		IO.println("1. Add new Student");
		IO.println("2. View Student Details by id");
		int choice = Integer.parseInt(IO.readln("Enter Your Choice"));
		switch (choice) {
		case 1 -> {
			Long id = Long.parseLong(IO.readln("Enter Student id"));
			String name = IO.readln("Enter Student Name");
			List<Long> phoneNumbers = new ArrayList<Long>();
			int noOfPhoneNo = Integer.parseInt(IO.readln("Enter How many phone number are there"));
			for(int i=0; i<=noOfPhoneNo; i++) {
				Long phone = Long.parseLong(IO.readln("Enter Phone number "+i));
				phoneNumbers.add(phone);
			}
			Student student = new Student(id,name,phoneNumbers);
			String saveStudent = service.saveStudent(student);
			System.out.println(saveStudent);
		}
		case 2 -> {
			Long id = Long.parseLong(IO.readln("Enter Student id want to find"));
			Student student = service.getStudentDetails(id).get();
			System.out.println(student);
		}
		default -> System.err.println("Invalid choice");
		}
	}

}
